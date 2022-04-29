package com.esther.p1_4;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float len,wid;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Length and Width Respectively..!!\n");
		len=sc.nextFloat();
		wid=sc.nextFloat();
		Rectangle r=new Rectangle();
		r.setLength(len);
		r.setWidth(wid);
		r.areaRectangle();
		r.Perimeter();
		r.display();

	}

}
