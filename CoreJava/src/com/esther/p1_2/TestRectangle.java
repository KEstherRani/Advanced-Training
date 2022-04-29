package com.esther.p1_2;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("The Area of Rectangle for all objects are: \n");
		
		Rectangle r1=new Rectangle();
		r1.display();
		
		Rectangle r2=new Rectangle(20,10);
		r2.calculateRectangle();
		r2.display();
		
		Rectangle r3=new Rectangle(50,70);
		r3.calculateRectangle();
		r3.display();
		
		Rectangle r4=new Rectangle(89,44);
		r4.calculateRectangle();
		r4.display();
		
		Rectangle r5=new Rectangle(35,66);
		r5.calculateRectangle();
		r5.display();

	}

}
