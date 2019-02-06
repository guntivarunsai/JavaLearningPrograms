package com.FilesandStreams;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

public class StoreObj {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		// connect FileOutputStream to the objfile
		FileOutputStream fos = new FileOutputStream("objFile.txt");

		// connect ObjectOutputStream to the FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		System.out.println("How many Employees ?");
		int n = Integer.parseInt(bufferedReader.readLine());

		for (int i = 0; i < n; i++) {

			Employeee employeee = new Employeee();
			employeee.getData();
			oos.writeObject(employeee);
		}
		oos.close();

	}
}
