package com.javaboot.eje3;

import org.junit.Test;

public class TestRecentFile {

	@Test
	public void TestAddFile(){
		RecentFile list = new RecentFile();
		
		list.addFile("documento.doc");
		list.addFile("libro.xls");
		list.addFile("imagen2.jpg");
		list.addFile("imagen1.bmp");
		list.addFile("circuito.cir");
		list.addFile("diagrama.dia");
		list.addFile("clase.java");
		list.addFile("presentacion.pps");
		list.addFile("video1.avi");
		list.addFile("video2.mkv");
		list.addFile("audio.wav");
		list.addFile("musica.mp3");
		list.addFile("texto.txt");
		list.addFile("config.ini");
		list.addFile("programa.exe");
		list.addFile("programa2.jar");
		list.addFile("chrome.exe");
		list.addFile("presentacion.pps");
		list.showFile();
		list.cantFile();
	}

}
