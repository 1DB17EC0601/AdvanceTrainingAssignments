package com;

public class BankAccount {
	
	int accNo;
	String accType;
	String custName;
	double balance;
	public BankAccount(int accNo, String accType, String custName, double balance) {
		super();
		this.accNo = accNo;
		this.accType = accType;
		this.custName = custName;
		this.balance = balance;
	}
	
	
	public void deposite(double add) throws Exception 
	{
		if(balance<0) {
			throw new Exception("Negative balance can't deposite");
		}
		else
		balance=balance+add;
		System.out.println("Deposited Succesfully");
		System.out.println("The balance in the account after the deposite is "+balance);
			
	}
	
	
	public void withdraw(double remove) throws Exception
	{
		if(accType=="savings")
		{
			if(balance<1000)
				throw new Exception ("Insufficient balance.....!");
			else
			{
				if(balance>1000) {
				balance=balance-remove;
				System.out.println("Withdraw Succesful");
				System.out.println("The balance after the withdrawal is "+balance);
				}
			}
				
		}
		else if(accType=="current")
		{
			if(balance<5000)
				throw new Exception ("Insufficient balance.....!");
			else
			{
				if(balance>5000) {
				balance=balance-remove;
				System.out.println("Withdraw Succesful");
				System.out.println("The balance after the withdrawal is "+balance);
				}
			}
		}
		else 
		{
			System.out.println("Invalid account type");
		}
	}
	
	public double getBalance() throws Exception
	{
		
		if(accType=="savings")
	    {
			if(balance<1000)
				throw new Exception ("Low Balance....!");
			
				
		}
		
		else if(accType=="current")
	    {
			if(balance<5000)
				throw new Exception ("Low Balance....!");
			
				
		}
		
			
		return balance;
		
	}
	

}
