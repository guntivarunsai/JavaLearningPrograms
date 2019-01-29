package com.abstractinterfaces;

interface Father
{
	float height = 6.2f;
	void height();
}

interface Mother
{
	float height = 5.8f;
	void height();
}

class Child implements Father,Mother
{

	@Override
	public void height() {
		// TODO Auto-generated method stub
		float childHt = ((Father.height+Mother.height)/2);
		System.out.println(childHt);
	}
}
public class MultiInterface {
	
	public static void main(String[] args) {
		 Child child = new Child();
		 child.height();
	}
}
