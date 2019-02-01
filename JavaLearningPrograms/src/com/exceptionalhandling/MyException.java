package com.exceptionalhandling;

public class MyException extends Exception {

	private static int accout[] = { 1001, 1002, 1003, 1004 };
	private static String name[] = { "Vinay", "Haneesha", "Ajay", "Karthik" };
	private static double bal[] = { 10000.00, 2000.00, 3000.00, 400.00 };

	// Default Constructor
	MyException() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	MyException(String str) {
		super(str);
	}

	// Main Method
	public static void main(String[] args) throws MyException {
		try {
			System.out.println("AccountNo" + "\t" + "Customer Name" + "\t" + "Balance");
			for (int i = 0; i < 4; i++) {
				System.out.println(accout[i] + "\t" + name[i] + "\t" + bal[i]);
				if (bal[i] < 1000) {
					MyException me = new MyException("Balance amount is lessthan 1000 pls maintain minimum balance");
					throw me;
				}
			}
		} catch (MyException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			System.out.println("Program Ended");
		}
	}

}
