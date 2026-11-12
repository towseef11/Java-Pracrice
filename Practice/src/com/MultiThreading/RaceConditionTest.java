package com.MultiThreading;

class counter {
	int count = 0;

	public synchronized void increment() {
		count++;
	}
}

public class RaceConditionTest {
	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();
		   Runnable r = () ->{
			   for(int i=1;i<=1000;i++) {
				   c.increment();
			   }
		   };
		   
		   Thread th1 = new Thread(r);
		   Thread th2 = new Thread(r);
		   
		   th1.start();
		   th2.start();
		   
			th1.join();
			th2.join();
		   
		   System.out.println(c.count);
	}

}
