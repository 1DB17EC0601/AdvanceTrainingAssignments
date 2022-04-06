package com;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BankAccount b = new BankAccount(984463,"savings", "Mallappa",5000.00 );
		
		b.deposite(1000);	
		System.out.println(b.getBalance());
		b.withdraw(6000.0);
		
	}

}
