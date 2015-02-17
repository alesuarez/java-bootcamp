package com.finalproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "idProduct")
	long idProduct;
	
	@NotNull
	@Column(name = "name")
	String name;
	
	@NotNull
	@Column(name = "price")
	int price;
	
	@OneToMany(mappedBy="product")
	private List<Line> lineList;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	
	public Product(){}
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setCategory(Category category){
		this.category=category;
	}
	public long getIdCategory(){
		return this.category.getIdCategory();
	}
	public String getNameCategory(){
		return this.category.getName();
	}
	
}
