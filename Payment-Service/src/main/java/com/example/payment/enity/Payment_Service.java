package com.example.payment.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PAYMENT_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment_Service { 
  
	@Id
	@GeneratedValue
	private Integer paymentId;
	private String paymentStatus;
	private String transactionId;
	private Integer orderId;
	private Double amount;
	
	
	public String setTransactionId(String string) {
	return	this.transactionId=string;
	}
}
