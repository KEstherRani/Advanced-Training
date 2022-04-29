package com.esther.p5_2;

public class SplitMethod {

	public static void main(String[] args) {
		
		String reg= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w=reg.split("\\s");
		
		for(String w1:w){  
			System.out.println(w1); 
			//System.out.println(" ");
		}
	}
}
