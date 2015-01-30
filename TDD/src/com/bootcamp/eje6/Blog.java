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
	public void deleteEntry(String title) {
		// TODO Auto-generated method stub
		
		boolean band=false;
		
		for(int j=0;j<entry.size();j++){
			if (title.equalsIgnoreCase(entry.get(j).getTitle())){
				entry.remove(j);
				System.out.println("Entrada borrada con exito");
				band=true;
			}
				
		}
		if (!band) System.out.println("Entrada no encontrada");		
		
		
	}
	public void viewAllEntry() {
		// TODO Auto-generated method stub
		System.out.println(entry);
		
	}
	public void updateEntry(String title, String content) {
		// TODO Auto-generated method stub
		boolean band=false;
		for(int j=0;j<entry.size();j++){
			if (title.equalsIgnoreCase(entry.get(j).getTitle())){
				entry.get(j).setContent(content);
				System.out.println("Entrada modificada con exito");
				band=true;
			}
				
		}
		if (!band) System.out.println("Entrada no encontrada");	
		
	}
	public void viewMostRecent() {
		// TODO Auto-generated method stub
		int size=entry.size();
		int i;
		int contador=10;
		for (i=size;i>=0;i--){
			System.out.println(entry.get(i-1).toString());
			contador--;
			if (contador==0) i=-1;
		}
		
		
	}
	public void viewTagAll() {
		// TODO Auto-generated method stub
		
	}
	
	
}
