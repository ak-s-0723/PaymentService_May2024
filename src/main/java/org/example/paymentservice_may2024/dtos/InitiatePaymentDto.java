package org.example.paymentservice_may2024.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDto {
    private Long amount;
    private String email;
    private String phoneNumber;
    private String orderId;
}
