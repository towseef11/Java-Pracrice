package com.MultiThreading;

public class TestDemo1 extends Thread{
  
	@Override
   public void run() {
	 for(int i=0;i<5;i++) {
		 System.out.println(Thread.currentThread().getName()+" "+i);
	 }
   }	
	
   public static void main(String[] args) {
	 TestDemo1 t1 = new TestDemo1();
	 TestDemo1 t2 = new TestDemo1();
	 t1.start();
	 t2.start();
  }
}
