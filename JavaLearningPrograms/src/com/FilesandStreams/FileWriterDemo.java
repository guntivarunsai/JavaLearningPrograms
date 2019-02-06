package com.FilesandStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		String str = "This is a Java Full Stack CLass." + "\nI am a Learner of Java1.";

		/*
		 * File file = new File("MyFileWriter.txt"); file.createNewFile();
		 */

		FileWriter fileWriter = new FileWriter("MyFileWriter.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		for (int i = 0; i < str.length(); i++) {
			bufferedWriter.write(str.charAt(i));
		}
		bufferedWriter.close();

	}
}
