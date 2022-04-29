package com.esther.p5_1;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "JAVA is Simple";
		
		System.out.println(str.toUpperCase()); //UpperCase
		
		System.out.println(str.toLowerCase()); 
		
		
		String[] s1=str.split("\\s");
		for(String w:s1){  
			System.out.print(w.charAt(0)); 
			System.out.print(" ");
		}
		System.out.println(" ");
		
		
		String[] s2=str.split("\\s");
		for(String w:s2){  
			System.out.println(w); 
		}
		
		//String Builder reverse
		StringBuilder s3= new StringBuilder("JAVA is Simple");
		
		Object words21;
		System.out.println("String = " + s3.toString());
		StringBuilder reverseStr = s3.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		//Total Length
		System.out.println("length of string " + str.length());
		

	}

}
