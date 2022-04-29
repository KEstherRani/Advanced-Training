package com.esther.p1_2;

public class Rectangle {
		float length,breadth,area;
		Rectangle()
		{
			length=0;
			breadth=0;
			}
		
		Rectangle(float length, float breadth)
		{
			this.length=length;
		    this.breadth=breadth;
			}
		void calculateRectangle()
		{
			area=length*breadth;
		}
		void display()
		{
			System.out.println("Area of Rectangle is: "+area);
		}

}
