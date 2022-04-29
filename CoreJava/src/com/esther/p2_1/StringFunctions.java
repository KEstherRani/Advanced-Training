package com.esther.p2_1;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,arr,str1[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: !\n");
		str=sc.nextLine();
		System.out.println("Length of String is: "+str.length());
		System.out.println("String in UpperCase:"+str.toUpperCase());
		
		StringBuffer s1=new StringBuffer(str);
		StringBuffer s2=new StringBuffer(str);
		s1.reverse();
		if(String.valueOf(s1).compareTo(String.valueOf(s2))==0){
			System.out.println("String "+str+" is Palindrome");
		}
		else
		{
			System.out.println("String "+str+" is Not Palindrome");
		}

	
		

	}

}
