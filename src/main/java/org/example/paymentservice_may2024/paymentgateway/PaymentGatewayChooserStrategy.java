package org.example.paymentservice_may2024.paymentgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGatewayChooserStrategy {
    @Autowired
    private RazorpayPaymentGateway razorpayPaymentGateway;

    public PaymentGateway getPaymentGateway() {
        return razorpayPaymentGateway;
    }
}
