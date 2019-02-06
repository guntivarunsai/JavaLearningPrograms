package com.FilesandStreams;

import java.io.File;

public class FileProp {
	
	public static void main(String[] args) {
		
		File file = new File("myFile.txt");
		
		System.out.println("File Name: "+file.getName());
		System.out.println("Path : "+file.getPath());
		System.out.println("Absolute Path  : "+file.getAbsolutePath());
		System.out.println("Parent  : "+file.getParent());
		System.out.println("Exists : "+file.exists());
		
		if(file.exists())
		{
			System.out.println("Is writable : "+file.canWrite());
			System.out.println("Is readable : "+file.canRead());
			System.out.println("Is a directory : "+file.isDirectory());
			System.out.println("File size in Bytes : "+file.length());
		}
	}

}
