package com.MultiThreading;

public class TestDemo2 implements Runnable {
	
	int start,end ;
	
    public void run() {
    	for(int i=start;i<end;i
    			++) {
    		System.out.println(Thread.currentThread().getName());
    	}
    }
    
	public TestDemo2(int start,int end) {
		this.start = start;
		this.end = end;
	}
	public static void main(String[] args) {
         TestDemo2 t1 = new TestDemo2(1,5);
         TestDemo2 t2 = new TestDemo2(6,10);
         Thread th1 = new Thread(t1);
         Thread th2 = new Thread(t2);
         th1.getName();
         th1.setName("My Thread");
         th1.getName();
         th1.start();
	    	 th2.start();

	
}}
