package com.wipro.anonymous;

interface BankOps {
    void deposit(double amount);
}

public class Bankdetails {
	
	 BankOps savingsAccount = new BankOps() {
	        
	        public void deposit(double amount) {
	            System.out.println("Depos" + amount + " into Savings Account.");
	            
	        }
	    };

	   
	    BankOps currentAccount = new BankOps() {
	        
	        public void deposit(double amount) {
	            System.out.println("Depos" + amount + " into Current Account.");
	            
	        }
	    };

	    public static void main(String[] args) {
	        
	        Bankdetails bank = new Bankdetails();

	        bank.savingsAccount.deposit(500.75);
	        bank.currentAccount.deposit(1200.50);
	    }
	
}
	