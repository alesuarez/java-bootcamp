package com.bootcamp.eje6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlog {

	@Test
	public void TestBlog() {
		Blog blog = new Blog("Blog test");
		Entry entry=new Entry("Hola mundo","Esta es la primera entrada del blog");
		blog.addEntry(entry);
		blog.viewEntry(0);
	}

}
