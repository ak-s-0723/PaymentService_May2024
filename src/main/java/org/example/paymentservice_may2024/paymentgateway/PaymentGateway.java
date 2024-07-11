package org.example.paymentservice_may2024.paymentgateway;

public interface PaymentGateway {
    String getPaymentLink(Long amount,String email,String phoneNumber,String orderId);
}
