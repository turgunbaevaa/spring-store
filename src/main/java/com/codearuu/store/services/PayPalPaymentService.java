package com.codearuu.store;

import org.springframework.stereotype.Service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(String accountId, String orderId, double amount) {
        System.out.println("PayPal payment processing started");
        System.out.println("PayPal account ID: " + accountId);
        System.out.println("PayPal order ID: " + orderId);
        System.out.println("Amount: " + amount);
    }
}
