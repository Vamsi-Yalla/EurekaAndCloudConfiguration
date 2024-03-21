package com.example.order_service.dto;

import com.example.order_service.entity.Order_Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transactionresponce {
private Order_Service order_Service;
private PaymentDto paymentDto;
	
}
