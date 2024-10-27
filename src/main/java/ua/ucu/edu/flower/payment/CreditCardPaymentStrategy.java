package ua.ucu.edu.flower.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " with Credit Card.");
    }
}