package com.bootcamp.eje6;

import java.util.ArrayList;

public class Blog {
	private String name;
	private ArrayList<Entry> entry = new ArrayList<Entry>();
	public Blog(String name){
		this.name=name;
	}
	public  void addEntry(Entry entry) {
		// TODO Auto-generated method stub
		this.entry.add(entry);
	}
	public void viewEntry(int i) {
		// TODO Auto-generated method stub
		System.out.println(this.entry.get(i).toString());		
	}
	
}
