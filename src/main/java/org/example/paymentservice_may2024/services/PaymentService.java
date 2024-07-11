package org.example.paymentservice_may2024.services;

import org.example.paymentservice_may2024.paymentgateway.PaymentGateway;
import org.example.paymentservice_may2024.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentGatewayChooserStrategy paymentGatewayChooserStrategy;

    public String initiatePayment(Long amount,String email,String phoneNumber,String orderId) {
        PaymentGateway pg = paymentGatewayChooserStrategy.getPaymentGateway();
        return pg.getPaymentLink(amount,email,phoneNumber,orderId);
    }
}

