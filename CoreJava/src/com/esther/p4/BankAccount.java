package com.esther.p4;

public class BankAccount {
	int accNo;
	String custName,accType;
	float balance=0;
	
	
	BankAccount(int accNo,String custName,String accType,float balance){
		this.accNo=accNo;
		this.custName=custName;
		this.accType=accType;
		this.balance=balance;	
	}
	
	
	public void deposit (float amt)throws NegativeAmountException
	{
		if(amt<=0)
		{
			throw  new NegativeAmountException("Nagative Ammount Exception ");
		}
		else{
			balance=amt;
		}
		
	}
	
	public void withdraw(float amt)throws InsufficientFundsException
	{
		if(accType=="savings" && balance<1000)
		{
			throw new InsufficientFundsException("Insufficient Funds Exception ");
		}
		else if(accType=="current" && balance<5000)
		{
			throw new InsufficientFundsException("Insufficient Funds Exception ");
		}
		else{
			balance=balance-amt;
		}
	}
	
	public float getBalance() throws LowBalanceException
	{
		if(balance<=0)
		{
			throw new LowBalanceException("Low Balance Exception Occurred");
		}
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			BankAccount ba=new BankAccount(12456,"Esther Rani","savings",1000);
			ba.deposit(6000);
			ba.withdraw(1000);
			float bal=ba.getBalance();
			System.out.println("Current Balance in Account: "+bal);
		}
		catch(Exception e){
			System.out.println("Exception Occurred: "+e.getMessage());
		}
		
		

	}

}
class NegativeAmountException extends Exception{
	 NegativeAmountException(String s){
		super(s);
	}
}

class InsufficientFundsException extends Exception{
	InsufficientFundsException(String s){
		super(s);
	}
}

class LowBalanceException extends Exception{
	LowBalanceException(String s){
		super(s);
	}
}
