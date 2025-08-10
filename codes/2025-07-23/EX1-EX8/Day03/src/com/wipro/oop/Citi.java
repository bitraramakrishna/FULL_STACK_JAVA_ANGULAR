package com.wipro.oop;

public class Citi implements BankOps {

	 public void deposit(double amount, String accNumber) {
	        System.out.println("Citi: deposit " + String.format("%.2f", amount) + " for " + accNumber);
	    }

	    @Override
	    public double withdraw(double amount, String accNumber) {
	        System.out.println("Citi: withdrawal " + String.format("%.2f", amount) + " from " + accNumber);
	        return 0.0; 
	    }

}
