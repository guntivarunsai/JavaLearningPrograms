package com.FilesandStreams;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class CreateFileEffiency {

	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(System.in);
		//Create a FIle
		FileOutputStream fout = new FileOutputStream("myFile.txt",true);
		
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		System.out.println("Enter text (@ at the end: )");
		
		char ch;
		//We wrote data in it in this logic
		while((ch = (char)dis.read())!='@')
			bout.write(ch);
			bout.close();
	}
}
