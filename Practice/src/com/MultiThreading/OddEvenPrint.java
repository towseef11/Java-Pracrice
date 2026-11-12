package com.MultiThreading;

class PrintNums{
	int counter = 1;
	int max = 10;
	
	public synchronized void PrintOdd() throws InterruptedException {
         while(counter<=10) {
        	 if(counter%2==0)
        		 wait();
        	 else {
        		 System.out.print(counter+" ");
        	     notify();
        	     counter++;
        	 }
        	 
         }
	}
	
	public synchronized void PrintEven() throws InterruptedException {
		while(counter<=10) {
			 if(counter%2 == 1)
				 wait();
			 else {
				 System.out.print(counter+" ");
				 notify();counter++;
			 }
		}
	}
}


public class OddEvenPrint {
     public static void main(String[] args) {
		PrintNums p = new PrintNums();
		Runnable  odd = () -> {
                 try {
					p.PrintOdd();
				 } catch (InterruptedException e) {
					e.printStackTrace();
				 }
		};
		
		Runnable even = () -> {
			try {
				p.PrintEven();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Thread th1 = new Thread(odd);
		Thread th2 = new Thread(even);
		
		th1.start();
		th2.start();
					
	
	}
}
