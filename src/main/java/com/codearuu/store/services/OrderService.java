package com.codearuu.store.services;

import com.codearuu.store.interfaces.PaymentService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Initializing Order Service PostConstruct");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleaning up Order Service PreDestroy");
    }

    public void placeOrder() {
        paymentService.processPayment("23564613", "1", 10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
