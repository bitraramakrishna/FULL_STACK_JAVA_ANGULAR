package com.wipro.paymentms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentMessage {
	private Long bookingId;
    private double amount;
    private String mode;

}
