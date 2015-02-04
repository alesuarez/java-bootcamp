package com.javaboot.mysql;

import java.sql.*;

import javax.swing.JOptionPane;


public class Principal {
	 	
	public static void main(String[] args) {
		 Connection miConexion;
	        miConexion=ConexionDB.GetConnection();
	      
	        if(miConexion!=null)
	        {
	            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
	        }
		
	}

}
