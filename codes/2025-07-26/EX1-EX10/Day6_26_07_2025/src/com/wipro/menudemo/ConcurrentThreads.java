package com.wipro.menudemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentThreads {
	
	public static void main(String[] args) {
        System.out.println("Starting");

        ExecutorService ex = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            ex.submit(() -> {
               
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Task " + taskId + ": " + j );
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println("Task " + taskId + " finished");
            });
        }


    }
}
