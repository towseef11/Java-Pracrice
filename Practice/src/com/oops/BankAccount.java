package com.oops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
   private long accountNumber;
   private double balance;
   
   public BankAccount() {}
   
   public BankAccount(long accountNumber, int balance) {
	   this.accountNumber=accountNumber;
	   this.balance=balance;
   }
   
   public long getAccountNumber() {
	   return accountNumber;
   }
   
   public double getBalance() {
	   return balance;
   }
   
   public void deposite(double amount) {
	   System.out.println("Current Balance : "+balance);
	   balance=balance+amount;
	   System.out.println("after depositing "+balance);
   }
   
   public void withdraw(double draw) {
	   System.out.println("Current Balance : "+balance);
	   if(draw<=balance) {
		   balance=balance - draw;
		   System.out.println("Remaining Balance : "+balance);
	   }
	   else System.out.println("Insufficient Balance !!");
   }
   
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   
	   List<BankAccount> list = Arrays.asList(
			        new BankAccount(5544332211l,40000),
			        new BankAccount(5544332299l,60000),
			        new BankAccount(5544332266l,20000),
			        new BankAccount(5544332233l,90000)
			   );
	   
	   System.out.println("Enter Account Number : ");
	   long accountNumber = sc.nextLong();
	   
	   for(BankAccount bacc:list) {
		   if(list.contains(bacc)) {
			   System.out.println(bacc.getAccountNumber());
			   System.out.println(bacc.getBalance());
			   
			   System.out.println("enter 1 for deposite or enter 2 for withdraw -> ");
			   int num=sc.nextInt();
			   System.out.println();
			   
			   if(num==1) {
			            System.out.println("Enter the amount to Deposite : ");
			            double amount = sc.nextInt();
			            bacc.deposite(amount);
			   }
			   else if(num==2) {
			   System.out.println("Enter the amount to withdraw : ");
			   double draw = sc.nextInt();
			   bacc.withdraw(draw);
			   }
			   else System.out.println("Enter a valid input !!");
		   }
		   else System.out.println("Enter valid Account Number !!5");
	   }
	   
	   
   }
   
}
