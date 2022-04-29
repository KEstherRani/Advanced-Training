package com.esther.p3_2;

public class Medicine{
	public void displayLabel(){
	System.out.println("Company : Apollo Pharmacy");
	System.out.println("Address : Mumbai");
	}
	}
class Tablet extends Medicine{
	 
public void displayLabel(){
	System.out.println("Store in a Cool and Dry Place");
	}
}
class Syrup extends Medicine{
	public void displayLabel(){
	System.out.println("Consume as directed by the Physician");
	}
	}
class Ointment extends Medicine{
	public void displayLabel(){
	System.out.println("For External Use Only");
}
}