package com.abstractinterfaces;

interface Tax {
	double stateTax();
}

class Telangana implements Tax {
	@Override
	public double stateTax() {
		System.out.println("According to Telangana Govt rules: ");
		return 5000.50;
	}

}

class Karnataka implements Tax {

	@Override
	public double stateTax() {
		// TODO Auto-generated method stub
		System.out.println("According to Karnataka Govt Rules:");
		return 2000.00;
	}
}

public class TaxApp {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		/*
		 * Class c = Class.forName(args[0]); Tax ref =(Tax)c.newInstance();
		 */

		Telangana telangana = new Telangana();
		calculateTaxValue(telangana);

		Karnataka karnataka = new Karnataka();
		calculateTaxValue(karnataka);
	}

	private static void calculateTaxValue(Tax ref) {
		double ct = 1000.00;
		double st = ref.stateTax();
		System.out.println("Total Tax : " + (ct + st));
	}

}
