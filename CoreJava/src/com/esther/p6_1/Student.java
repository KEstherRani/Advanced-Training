package com.esther.p6_1;

import java.util.Scanner;

public class Student {
	String[] stud={"Esther","Rani","Sunny","Sujana","Benny"};
	int flag=0,i;
	
	void search(String str)
	{
		for( i=0;i<stud.length;i++)
		{
			if(stud[i].equalsIgnoreCase(str))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Student "+str+  " is Found in ArrayList");	
		}
		else
			System.out.println("Student Not Found");
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Name to Find in ArrayList..!");
		Scanner sc=new Scanner(System.in);
		String newstr=sc.nextLine();
		Student s=new Student();
		s.search(newstr);
		

	}

}
