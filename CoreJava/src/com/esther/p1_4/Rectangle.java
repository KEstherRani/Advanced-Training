package com.esther.p1_4;

public class Rectangle {
	float length,width,area,perimeter;
	
	Rectangle()
	{
		length=1;
		width=1;
	}
	
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if((length>0.0) && (length<=20.0))
		{
			this.length = length;
		}
		else
		{
			System.out.println("Length is not vaild number, it should be <=20.0 and >0");
			System.exit(0);
		}
		
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		
		if((width>0.0) && (width<=20.0))
		{
			this.width = width;
		}
		else
		{
			System.out.println("Width is not vaild number, it should be <=20.0 and >0");
			System.exit(0);
		}
	}
	Rectangle(float length, float width)
	{
		this.length=length;
	    this.width=width;
		}
	void areaRectangle()
	{
		area=length*width;
	}
	void Perimeter()
	{
		perimeter=2*(length+width);
	}
	void display()
	{
		System.out.println("Area of Rectangle is: "+area);
		System.out.println("Area of Rectangle is: "+perimeter);
	}

}
