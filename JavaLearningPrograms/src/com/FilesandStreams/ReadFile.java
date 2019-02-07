package com.FilesandStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		final String MY_FILE = "myFile.txt";
		
		FileInputStream fis = new FileInputStream(MY_FILE);
		
		FileInputStream fis1 = new FileInputStream(MY_FILE);
		
		System.out.println("File Contents");
		
		//read characters from FileInputStream and write them
		//to monitor. Repeat this till the end of file.
		
		int ch;
		
		while((ch=fis.read())!=-1)
			System.out.println((char)ch);
		fis.close();
		
	}
}
