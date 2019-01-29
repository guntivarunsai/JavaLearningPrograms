package com.abstractinterfaces;

abstract class Myclass1
{
	public abstract void calculate(double x);
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

class Square extends Myclass1
{

	@Override
	public void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square Value : "+(x*x));
		
	}
}

class Cube extends Myclass1
{

	@Override
	public void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Cube Value  : "+(x*x*x));
	}
	
}

class SquareRoot extends Myclass1
{

	@Override
	public void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square Root : "+(Math.sqrt(x)));
		
	}
}
public class DifferentAbstract {
	public static void main(String[] args) {
		
		Square square = new Square();
		SquareRoot squareRoot = new SquareRoot();
		Cube cube = new Cube();
		
		square.calculate(5);
		squareRoot.calculate(25);
		cube.calculate(3);
		
		cube.add(5, 9);
	}

}
