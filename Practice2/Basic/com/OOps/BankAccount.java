package com.OOps;

public class BankAccount {
	private String accountHolderName;
	private double balance;
	
    

	public BankAccount() {
	}

	public BankAccount(String accountHolderName, double balance) {
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public String getName() {
		return accountHolderName;
	}
	
	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		if (amount > 0)
		    balance = balance + amount;
		return balance;
	}

	public double withdraw(double amount) {
		if (balance > amount) {
			balance = balance - amount;
			return balance;
		} 
		
		else if(amount < 0){
			System.out.println("Invalid Amount");
		}
		
		else
			System.out.println("Insufficient balance !");
		return 0;
	}

	public void accountDetails() {
	     
	     System.out.println(getName());
	    System.out.println(getBalance());
	}
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount("Towseef",12500);
		bank.accountDetails();
		bank.deposit(500.0);
		bank.accountDetails();
		
	}

}
