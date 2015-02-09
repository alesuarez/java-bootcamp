package com.javaboot.rest;

import javax.ws.rs.*;


@Path("/user/service")
public class UserService {
	@PUT
	@Path("/create")
	public void createUser(){
		System.out.println("creando usuario");
	}
	@GET
	public void getUser(){
		System.out.println("get usuario");
	}
	@POST
	public void updateUser(){
		System.out.println("update usuario");
	}
	@DELETE
	public void deleteUser(){
		System.out.println("delete usuario");
	}
}
