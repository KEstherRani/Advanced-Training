package com.esther.p1_3;

import java.util.Scanner;

public class TestBooks {
	public void createBooks() {
		Books bk[] = new Books[2];		 
	      bk[0] = new Books("Java Programing ", 350.50);
	      bk[1] = new Books("Let Us C", 200.00);
	      for(int i = 0; i<bk.length; i++) {
		         bk[i].display();
		         System.out.println(" ");
	      }
	    
	      }
	
	public void showBooks() {
		  	createBooks();
		
	}
	public static void main(String args[])  {
	    TestBooks c1 = new TestBooks();  
		c1.showBooks();
	   
	      }

}
