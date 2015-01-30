package com.bootcamp.eje6;

public class Entry {
	private String title;
	private String content;
	
	public Entry(String title, String content) {
		this.title = title;
		this.content = content;
	}
	public String toString(){
		return "\nTitle: "
				+title
				+"\n"+content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
