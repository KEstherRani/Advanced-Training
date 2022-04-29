package com.esther.p2_2;

import java.util.Scanner;

public class SumOfPrevious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=13, num1, num2;
		System.out.println("Enter two Numbers...!!");
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = num1; i <= count; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
		

	}

}
