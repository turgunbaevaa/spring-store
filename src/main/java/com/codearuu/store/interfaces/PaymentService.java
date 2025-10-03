package com.codearuu.store;

public interface PaymentService {
    void processPayment(String accountId, String orderId, double amount);
}
