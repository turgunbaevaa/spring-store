package com.codearuu.store.services;

import com.codearuu.store.interfaces.PaymentService;

public class PayPalPaymentService implements PaymentService {

    @Override
    public void processPayment(String accountId, String orderId, double amount) {
        System.out.println("PayPal payment processing started");
        System.out.println("PayPal account ID: " + accountId);
        System.out.println("PayPal order ID: " + orderId);
        System.out.println("Amount: " + amount);
    }
}
