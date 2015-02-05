package com.javaboot.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Principal {


	public static void main(String[] args) {
		Principal miPrincipal = new Principal();
		//miPrincipal.punto4();
		miPrincipal.finalNotes("Tomcat");
	}
	private void teacher(){
		conectar cc= new conectar();
	    Connection cn=cc.conexion(); 
	    
	    conectar cc2 = new conectar();
	    Connection cn2=cc2.conexion();
	    
		  try {
			  Statement st = cn.createStatement();
			  Statement st2 = cn2.createStatement();
              ResultSet rs1,rs2;
              
              System.out.println("- Punto 7 -");
               rs1 = st.executeQuery("select T.firstName, T.lastName, C.name,C.idCourse from teacher T join course C on T.idTeacher=C.Teacher_idTeacher");
              
               while(rs1.next()){
            	   System.out.println("----------------------------------------------------------");
            	  
            	   System.out.println("Teacher: "+rs1.getString("lastName")+", "+rs1.getString("firstName"));
            	   System.out.println("Schedule:");
            	   
            	   rs2=st2.executeQuery("select S.firstName, S.lastName from student S join Course_has_Student CS on S.regNumber=CS.Student_regNumber join course C on C.idCourse=CS.Course_idCourse where C.idCourse="
            	   +rs1.getString("idCourse")+" order by S.lastName ASC");
            	   while(rs2.next())
            	   {
            		   System.out.println(rs2.getString("LastName")+", "+rs2.getString("firstName"));
            	   }
            	   
               }
               
               System.out.println("");
             
		   
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro la persona");
		  }
	}
	private void finalNotes(String lastName){
		conectar cc = new conectar();
		Connection cn = cc.conexion();
		try{
			Statement st= cn.createStatement();
			ResultSet rs;
			rs=st.executeQuery("select S.firstName, S.lastName,CS.finalNote,C.name from student S join Course_has_Student CS on S.regNumber=CS.Student_regNumber join course C on C.idCourse=CS.Course_idCourse where S.lastName='"+lastName+"' order by finalNote DESC");
			rs.next();
			System.out.println("Student: "+rs.getString("lastName")+", "+rs.getString("firstName"));
			do{
				System.out.println(rs.getString("name")+": "+rs.getString("finalNote"));
			}while(rs.next());
		}catch (SQLException e) {
            System.out.println(e.getMessage());
   JOptionPane.showMessageDialog(null, "No se Registro la persona");
  }
	}
	private void punto4(){
		conectar cc= new conectar();
	    Connection cn=cc.conexion(); 
	    
	    conectar cc2 = new conectar();
	    Connection cn2=cc2.conexion();
	    
		  try {
			  Statement st = cn.createStatement();
			  Statement st2 = cn2.createStatement();
              ResultSet rs1,rs2;
              
              System.out.println("- Punto 4 -");
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
               
               System.out.println("");
             
		   
		    
		  } catch (SQLException e) {
		            System.out.println(e.getMessage());
		   JOptionPane.showMessageDialog(null, "No se Registro la persona");
		  }
	}
}
