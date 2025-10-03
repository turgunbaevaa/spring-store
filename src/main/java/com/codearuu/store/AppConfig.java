package com.codearuu.store;

import com.codearuu.store.interfaces.PaymentService;
import com.codearuu.store.services.OrderService;
import com.codearuu.store.services.PayPalPaymentService;
import com.codearuu.store.services.StripePaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    public OrderService orderService(){
        if(paymentGateway.equals("stripe")){
            return new OrderService(stripe());
        }
        return new OrderService(paypal());
    }
}
