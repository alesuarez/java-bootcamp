package com.javaboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[] args){
		
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		
		User usuario1 = (User)context.getBean("user");
		usuario1.sayHi();
	}
}
