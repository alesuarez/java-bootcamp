package com.finalproject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalproject.dao.UserDAO;

@RestController
public class finalProjectController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping("/")
	public String home(){
		return "Running...";
	}
}
