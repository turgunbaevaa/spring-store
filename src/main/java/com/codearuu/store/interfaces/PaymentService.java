package com.codearuu.store.interfaces;

public interface PaymentService {
    void processPayment(String accountId, String orderId, double amount);
}
