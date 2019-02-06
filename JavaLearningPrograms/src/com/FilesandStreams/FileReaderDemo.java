package com.FilesandStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException {
		//var
		int ch;
		FileReader fileReader = null;
		//check if the file is there or not
		try
		{
			fileReader = new FileReader("MyFileWriter.txt");
		}
		catch (FileNotFoundException fe) {
			System.out.println("File not found");
			// TODO: handle exception
			return;
		}
		// read from fileReader toll the end of the file
		while((ch=fileReader.read())!=-1)
		{
			System.out.println((char)ch);
		}
		
		fileReader.close();
	}

}
