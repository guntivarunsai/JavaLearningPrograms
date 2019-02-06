package com.FilesandStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Employeee implements Serializable {

	private int id;
	private String name;
	private float sal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employeee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public void getData() throws NumberFormatException, IOException {
		// to read data from the Keybaord
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Employ Id:");
		this.setId(Integer.parseInt(bufferedReader.readLine()));

		System.out.println("Enter Name");
		this.setName(bufferedReader.readLine()); // bufferedReader.readLine();

		System.out.println("Enter Salary:");
		this.setSal(Float.parseFloat(bufferedReader.readLine()));
	}
}
