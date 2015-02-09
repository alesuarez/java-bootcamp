package com.javaboot.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/user")
public class UserService {
	
	@GET	
	@Path("/login/{param}")
	public String login(@PathParam("param")String user,String pass){
		return "Welcome "+user;
	}
	@GET
	@Path("/create")
	public void createUser(){
		System.out.println("usuario creado");
	}
	@POST
	@Path("/update")
	public void updateUser(){
		System.out.println("update usuario");
	}
	@DELETE
	@Path("/delete")
	public void deleteUser(){
		System.out.println("delete usuario");
	}
}
