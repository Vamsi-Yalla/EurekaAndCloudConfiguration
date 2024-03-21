package com.example.order_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order_service.dto.Transactionresponce;
import com.example.order_service.entity.Order_Service;
import com.example.order_service.serviceImpl.Order_serviceImpl;

@RestController
@RequestMapping("/order")
public class Order_controller {
	
	
	private Order_serviceImpl order_serviceImpl;

	public Order_controller(Order_serviceImpl order_serviceImpl) {
		super();
		this.order_serviceImpl = order_serviceImpl;
	}

	@PostMapping(value = "/create")
	public Transactionresponce createOrder_Service(@RequestBody Transactionresponce transactionresponce) {
	return order_serviceImpl.saveOrder_Service(transactionresponce);
	}
}
