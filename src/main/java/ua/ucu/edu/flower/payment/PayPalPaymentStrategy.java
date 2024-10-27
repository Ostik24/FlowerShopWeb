package ua.ucu.edu.flower.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}