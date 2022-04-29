package com.esther.p1_1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number!\n");
		num=sc.nextFloat();
		System.out.println("List of Even Numbers from 1 to "+num+ " are:");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}