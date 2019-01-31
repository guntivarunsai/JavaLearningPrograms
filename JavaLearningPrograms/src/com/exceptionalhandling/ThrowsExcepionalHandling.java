package com.exceptionalhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample
{
	private String name;
	public void acceptName() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Name");
		name = br.readLine();
	}
	public void displayName()
	{
		System.out.println("Name: "+name);
	}
}

public class ThrowsExcepionalHandling {
public static void main(String[] args) throws IOException {
	
	Sample sample = new Sample();
	sample.acceptName();
	sample.displayName();
}
	
}
