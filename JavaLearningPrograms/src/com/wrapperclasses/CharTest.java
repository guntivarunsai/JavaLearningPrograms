package com.wrapperclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharTest {
	public static void main(String[] args) throws IOException {

		char ch;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.println("Enter a Character: ");
			ch = (char) bufferedReader.read();

			System.out.println(": You Enterd :");

			if (Character.isDigit(ch)) {
				System.out.println("is a digit");
			} else if (Character.isWhitespace(ch)) {
				System.out.println("is a white space");
			} else if (Character.isLowerCase(ch)) {
				System.out.println("is a lowercase");
			} else if (Character.isUpperCase(ch)) {
				System.out.println("is a uppercase");
			} else {
				System.out.println("a white space character");
			}
			return;
		}

	}
}
