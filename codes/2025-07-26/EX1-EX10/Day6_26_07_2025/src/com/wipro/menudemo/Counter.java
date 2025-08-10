package com.wipro.menudemo;

public class Counter {
	private int count = 0;
    public void increment() {
        
        count++; 
    }
    public synchronized void incrementSynchronized() {
        
        count++;
    }
    public int getCount() {
        return count;
    }
}
