package com.wipro.menudemo;

import java.util.Scanner;

interface DigitalPaymentGateway {
    boolean processPayment(double amount, String transactionId);
    String getGatewayName();
}

class GooglePayGateway implements DigitalPaymentGateway {
    @Override
    public boolean processPayment(double amount, String transactionId) {
        // In a real scenario, this would involve calling a Google Pay API
        return amount > 0;
    }

    @Override
    public String getGatewayName() {
        return "Google Pay";
    }
}

class PhonePeGateway implements DigitalPaymentGateway {
    @Override
    public boolean processPayment(double amount, String transactionId) {
        
        return amount > 0 && amount <= 5000;
    }

    @Override
    public String getGatewayName() {
        return "PhonePe";
    }
}

class PaytmGateway implements DigitalPaymentGateway {
    @Override
    public boolean processPayment(double amount, String transactionId) {
        // In a real scenario, this would involve calling a Paytm API
        return amount > 0 && transactionId != null && !transactionId.isEmpty();
    }

    @Override
    public String getGatewayName() {
        return "Paytm";
    }
}

// PaymentProcessor handles the actual payment logic using a chosen gateway
class PaymentProcessor {
    private DigitalPaymentGateway paymentGateway;
    private static int transactionCounter = 0; // Shared counter for all payments

    public PaymentProcessor(DigitalPaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount) {
        String transactionId = "TXN_" + (++transactionCounter);
        System.out.println("Processing payment via " + paymentGateway.getGatewayName() + " for $" + amount + " (ID: " + transactionId + ")");
        boolean success = paymentGateway.processPayment(amount, transactionId);

        if (success) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Payment failed. Please check amount or transaction details.");
        }
        return success;
    }
}

// The main application class
public class DigitalPaymentApp { // Only one public class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DigitalPaymentGateway chosenGateway = null;

        int choice = -1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            scanner.close();
            return;
        }

        switch (choice) {
            case 1:
                chosenGateway = new GooglePayGateway();
                break;
            case 2:
                chosenGateway = new PhonePeGateway();
                break;
            case 3:
                chosenGateway = new PaytmGateway();
                break;
            default:
                System.out.println("Invalid choice. Exiting application.");
                scanner.close();
                return;
        }

        
        PaymentProcessor processor = new PaymentProcessor(chosenGateway);

        // Sample payments
        processor.makePayment(123.45); // Should succeed with all
       
        scanner.close();
        System.out.println("\n--- Demo Complete ---");
    }
}