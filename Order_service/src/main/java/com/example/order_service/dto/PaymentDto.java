package com.example.order_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {

	
	private String paymentStatus;
	private String transactionId;
	private Integer orderId;
	private Double amount;		
	public String setTransactionId(String string) {
	return	this.transactionId=string;
	}
}
