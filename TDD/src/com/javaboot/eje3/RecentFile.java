package com.javaboot.eje3;

import java.util.ArrayList;

public class RecentFile {
	private ArrayList<String> files = new ArrayList<String>();
	
	public void addFile(String file) {
		// TODO Auto-generated method stu
		int pos;
		
		if (files.isEmpty()){
			files.add(file);
		}else{
			pos=files.indexOf(file);
			if (pos==-1){
				files.add(file);
			}
			else{
				files.remove(pos);
				files.add(files.size(),file);
			}
			if (files.size()>15){
				files.remove(0);
			}
			
		}
		
	}

	public void showFile() {
		// TODO Auto-generated method stub
		
	       
	        	 System.out.println(files);
	        	
	
	}

	public void cantFile() {
		System.out.println(files.size());
		
	}

}
