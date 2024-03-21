package com.example.order_service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.order_service.dto.PaymentDto;
import com.example.order_service.dto.Transactionresponce;
import com.example.order_service.entity.Order_Service;
import com.example.order_service.repository.Order_Repository;

@Service
public class Order_serviceImpl {

	@Autowired
	private Order_Repository order_repository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	
	public Transactionresponce saveOrder_Service(Transactionresponce transactionresponce) {
		Order_Service order =transactionresponce.getOrder_Service();
		PaymentDto payment=transactionresponce.getPaymentDto();
		payment.setOrderId(order.getId());
		payment.setAmount(order.getPrice());
		PaymentDto paymentDto=restTemplate.postForObject("http://PAYMENT-SERVICE/payment/create", payment, PaymentDto.class);
		order_repository.saveAndFlush(order);
		
		return new Transactionresponce(order,paymentDto);
	}
}
