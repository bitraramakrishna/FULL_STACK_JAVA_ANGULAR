package com.wipro.menudemo;

public class MyThread extends Thread {
	private Counter counter;
    private boolean useSynchronized;

   
    public MyThread(Counter counter, boolean useSynchronized) {
        this.counter = counter;
        this.useSynchronized = useSynchronized;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting");
        for (int i = 0; i < 10; i++) { 
            if (useSynchronized) {
                //counter.incrementSynchronized(); 
                counter.increment();
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
               
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
