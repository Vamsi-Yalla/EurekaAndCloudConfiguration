package com.example.payment.Payment_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment.Payment_serviceImpl.PaymentServiceImpl;
import com.example.payment.enity.Payment_Service;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentServiceImpl paymentServiceImpl;
	
	@PostMapping(value = "/create")
	public Payment_Service savePayment_Service(@RequestBody Payment_Service payment_Service) {
		return paymentServiceImpl.createPayment_Service(payment_Service);
		
	}
	

}
