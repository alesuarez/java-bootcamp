package com.javaboot.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		conectar cc= new conectar();
	    Connection cn=cc.conexion(); 
	    
	    conectar cc2 = new conectar();
	    Connection cn2=cc2.conexion();
	    
		  try {
			  Statement st = cn.createStatement();
			  Statement st2 = cn2.createStatement();
              ResultSet rs1,rs2;
              
               rs1 = st.executeQuery("select T.lastName, T.firstName,C.name, C.idCourse from teacher T join course C on T.idTeacher=C.Teacher_idTeacher");
              
               while(rs1.next()){
            	   System.out.println("----------------------------------------------------------");
            	   System.out.println("Course: "+rs1.getString(3));
            	   System.out.println("Teacher: "+rs1.getString(1)+", "+rs1.getString(2));
            	   rs2=st2.executeQuery("select S.firstName, S.lastName from student S join Course_has_Student CS on S.regNumber=CS.Student_regNumber join course C on C.idCourse=CS.Course_idCourse where C.idCourse="
            	   +rs1.getString("idCourse")+" order by S.lastName ASC");
            	   while(rs2.next())
            	   {
            		   System.out.println(rs2.getString("LastName")+", "+rs2.getString("firstName"));
            	   }
            	   
               }
             
		   
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro la persona");
		  }
	}

}
