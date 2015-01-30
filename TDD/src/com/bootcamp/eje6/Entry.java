package com.bootcamp.eje6;

public class Entry {
	private String title;
	private String content;
	public Entry(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String toString(){
		return "\n Title:"
				+title
				+"\n"+content;
	}
	
}
