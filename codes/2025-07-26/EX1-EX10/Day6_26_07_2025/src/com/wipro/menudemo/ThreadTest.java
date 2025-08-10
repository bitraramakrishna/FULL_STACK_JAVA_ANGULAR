package com.wipro.menudemo;

public class ThreadTest {
	 public static void main(String[] args) throws InterruptedException {
  
	       /* Counter nonSyCou = new Counter();

	        MyThread thread1_nonSync = new MyThread(nonSyCou, false);
	        MyThread thread2_nonSync = new MyThread(nonSyCou, false);

	        thread1_nonSync.setName("Thread-1");
	        thread2_nonSync.setName("Thread-2");

	        thread1_nonSync.start();
	        thread2_nonSync.start();

	        
	        thread1_nonSync.join();
	        thread2_nonSync.join();

	        
	        System.out.println("Final count nonsys" + nonSyCou.getCount());
	        
	        Thread.sleep(1000);

	        
	        System.out.println(" Demonstrating Thread Safety Synchronized");*/
	        Counter syCou = new Counter();

	        MyThread thread1_sync = new MyThread(syCou, true);
	        MyThread thread2_sync = new MyThread(syCou, true);

	      
	        thread1_sync.start();
	        thread2_sync.start();

	        thread1_sync.join();
	        thread2_sync.join();

	        
	        System.out.println("Final count" + syCou.getCount());
	       
	    }
}
