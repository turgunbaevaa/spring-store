package com.codearuu.store.services;

import com.codearuu.store.interfaces.PaymentService;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(String accountId, String orderId, double amount) {
        System.out.println("Stripe payment processing started");
        System.out.println("Stripe account ID: " + accountId);
        System.out.println("Stripe order ID: " + orderId);
        System.out.println("Amount: " + amount);
        System.out.println("Api URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Current currency: " + supportedCurrencies);
    }
}
