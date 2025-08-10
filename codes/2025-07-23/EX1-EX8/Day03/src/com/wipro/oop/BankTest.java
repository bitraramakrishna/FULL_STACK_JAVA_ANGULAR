package com.wipro.oop;
import com.wipro.oop.HDFC;
import com.wipro.oop.Citi;
import com.wipro.oop.BankOps;

public class BankTest {
	public static void main(String[] args) {
        System.out.println("--- HDFC  BANK---");
        BankOps hdfc = new HDFC();
        hdfc.deposit(100.0, "HDFC2111");
        hdfc.withdraw(50.0, "HDFC111");

        System.out.println("\n--- Citi BANK ---");
        BankOps citi = new Citi();
        citi.deposit(200.0, "CI8222");
        citi.withdraw(75.0, "CI222");
    }

}
