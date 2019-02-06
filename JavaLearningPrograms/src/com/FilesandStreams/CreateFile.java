package com.FilesandStreams;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class CreateFile {

	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(System.in);
		//Create a FIle
		FileOutputStream fout = new FileOutputStream("myFileEffiency.txt");
		
		System.out.println("Enter text (@ at the end: )");
		
		char ch;
		//We wrote data in it in this logic
		while((ch = (char)dis.read())!='@')
			fout.write(ch);
			fout.close();
	}
}
