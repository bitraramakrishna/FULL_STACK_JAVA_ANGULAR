package com.wipro.menudemo;

class NumThread extends Thread {
    public NumThread() {
        super("NumberThread"); 
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": Number " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + "interrupted.");
            }
        }
    }
}


class AlpThread extends Thread {
    public AlpThread() {
        super("AlphabetPrinterThread"); 
    }

    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println(Thread.currentThread().getName() + ": Alphabet " + c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}

public class ThreadDemo {
	
	public static void main(String[] args) {
        
        NumThread thread1 = new NumThread();
        AlpThread thread2 = new AlpThread();

        thread1.start();
        thread2.start();

    }
}
