package com.carshop.test;

import org.hibernate.Session;

import com.carshop.model.Usuario;
import com.carshop.util.HibernateUtil;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	        session.beginTransaction();
	        Usuario usuario=new Usuario();
	        usuario.setApellido("petinato");
	        usuario.setClave("123");
	        usuario.setEmail("fasd");
	        usuario.setIdUsuario(123);
	        usuario.setNombre("roberto");
	        session.save(usuario);
	        session.getTransaction().commit();
	        

	}

}
