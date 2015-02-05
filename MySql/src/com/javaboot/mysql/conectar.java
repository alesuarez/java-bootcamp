package com.javaboot.mysql;

import java.sql.*;

import javax.swing.JOptionPane;

public class conectar {
	Connection conect = null;
	   public Connection conexion()
	    {
	      try {
	             
	           //Cargamos el Driver MySQL
	           Class.forName("com.mysql.jdbc.Driver");
	           conect = DriverManager.getConnection("jdbc:mysql://localhost/higth_school","root","");
	           
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(null,"Error"+e);
	        }
	        return conect;
	     
	}}

