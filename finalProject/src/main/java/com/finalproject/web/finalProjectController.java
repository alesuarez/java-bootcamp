package com.finalproject.web;









import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;











import com.finalproject.dao.*;
import com.finalproject.model.*;

@Controller
@RestController
public class finalProjectController {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	CategoryDAO CategoryDAO;
	
	@Autowired
	LineDAO LineDAO;
	
	
	
	@Autowired
	ProductDAO ProductDAO;
	
	@Autowired
	ShopDAO ShopDAO;


	
	@RequestMapping("/")
	public String home(){
		return "Running...";
	}

// metodos para dar de alta
	
	@RequestMapping("/createUser")
	public String createUser(String name, String lastName,String email,String pass) {
		try {
			User user = new User(name,lastName,email,pass);
			userDAO.save(user);
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
	
	@RequestMapping("/createCategory")
	public String createProduct(String name) {
		try {
			Category category = new Category(name);
			CategoryDAO.save(category);
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
	
	
	@RequestMapping("/createProduct")
	public String createProduct(String name,int price,long idCategoria) {
		try {
			
			Category category = CategoryDAO.findOne(idCategoria);
			Product product = new Product(name,price);
			product.setCategory(category);
			ProductDAO.save(product);
			
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
	@RequestMapping("/createShop")
	public String createShop(String date,long idUser) {
		try {
				
				User user=userDAO.findOne(idUser);
				Shop shop=new Shop(date,'s',user,"unknown");
				ShopDAO.save(shop);
			
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
// agregar productos a la linea
	@RequestMapping("/addProduct")
	public String addProduct(long idProduct,long idShop,long idUser) {
		try {
				User user=userDAO.findOne(idUser);
				Product product=ProductDAO.findOne(idProduct);
				Shop shop=ShopDAO.findOne(idShop);
				long idCategory=product.getIdCategory();
				Category category=CategoryDAO.findOne(idCategory);
				
				Line line = new Line(user,shop,product,category);
				LineDAO.save(line);
				
			
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
	@RequestMapping("/deleteProduct")
	public String deleteProduct(long idLine) {
		try {
				Line line=LineDAO.findOne(idLine);
				
				LineDAO.delete(line);
				//error como borrar??????
			
		} catch (Exception ex) {
			return "Error: " + ex.toString();
		}
		return "success!";
	}
// listar
	@RequestMapping("/listProduct")
	public Iterable<Product> listProduct() {
		
		return ProductDAO.findAll();
	}
	@RequestMapping("/listUser")
	public Iterable<User> listUser() {
		
		return userDAO.findAll();
	}
	@RequestMapping("/listCategory")
	public Iterable<Category> listCategory() {
		
		return CategoryDAO.findAll();
	}
	
	
//login
	
	@RequestMapping("/login")
	public String Login(String email,String pass){
		User user=userDAO.findByEmail(email);
		if (user.getPass().equals(pass)){
		return "success!";
		}
		
		
		return "fail";		
	}
	@RequestMapping("/list")
	
	public String getCategory() {
		
		return "hola";
		}
	}
		
	


