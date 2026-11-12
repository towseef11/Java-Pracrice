package com.MultiThreading;



public class Test implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
    public static void main(String[] args) {
    	Test t = new Test();
    	Thread th = new Thread(t);
    	th.start();
    	try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println("Main thread is finished");
    }
}