package com.wipro.oop;

public class HDFC implements BankOps {
	
	
	
	

    @Override
    public void deposit(double amount, String accNumber) {
        
    	System.out.println("HDFC: Depositing " + String.format("%.2f", amount) + " to " + accNumber);
        
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        
       
    	System.out.println("HDFC: Withdrawing " + String.format("%.2f", amount) + " from " + accNumber);
        return 0.0; 
    }

}
