package com.bootcamp.eje6;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestBlog {

	@Test
	public void TestBlog() {
		Blog blog = new Blog("Blog test");
		Entry entry=new Entry("Hola mundo","Esta es la primera entrada del blog");
		Entry entry2=new Entry("Segunda entrada","Hola esto es una segunda entrada");
		Entry entry3=new Entry("Entrada 3","Esta es la entrada del blog");
		Entry entry4=new Entry("Entrada 4 ","Esta es la entrada del blog");
		Entry entry5=new Entry("Entrada  5","Esta es la entrada del blog");
		Entry entry6=new Entry("Entrada 6","Esta es la entrada del blog");
		Entry entry7=new Entry("Entrada 7","Esta es la entrada del blog");
		Entry entry8=new Entry("Entrada 8","Esta es la entrada del blog");
		Entry entry9=new Entry("Entrada 9","Esta es la entrada del blog");
		Entry entry10=new Entry("Entrada 10","Esta es la entrada del blog");
		Entry entry11=new Entry("Entrada 11","Esta es la entrada del blog");
		Entry entry12=new Entry("Entrada 12","Esta es la entrada del blog");
		ArrayList<String> tag = new ArrayList<String>();
		blog.addEntry(entry);
		blog.viewEntry(0);
		blog.addEntry(entry2);
		blog.viewAllEntry();
		//blog.deleteEntry("Hola mundo");
		blog.viewAllEntry();
		blog.updateEntry("Segunda entrada","Hola reforme la segunda entrada");
		blog.viewAllEntry();
		
		blog.addEntry(entry3);
		blog.addEntry(entry4);
		blog.addEntry(entry5);
		blog.addEntry(entry6);
		blog.addEntry(entry7);
		blog.addEntry(entry8);
		blog.addEntry(entry9);
		blog.addEntry(entry10);
		blog.addEntry(entry11);
		blog.addEntry(entry12);
		blog.viewTagAll();
		blog.viewMostRecent();
	}

}
