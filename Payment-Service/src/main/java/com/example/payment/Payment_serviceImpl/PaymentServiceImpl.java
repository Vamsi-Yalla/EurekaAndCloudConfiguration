package com.example.payment.Payment_serviceImpl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.payment.Payment_Repository.PaymentServicerepository;
import com.example.payment.enity.Payment_Service;

@Service
public class PaymentServiceImpl {

	@Autowired
	private PaymentServicerepository paymentrepository;
	
	public Payment_Service createPayment_Service(Payment_Service payment_Service) {
		payment_Service.setPaymentStatus(paymentsuccess());
		payment_Service.setTransactionId(UUID.randomUUID().toString());
		return paymentrepository.save(payment_Service);
	}
	
	public String paymentsuccess() {
		return new Random().nextBoolean()?"Suceess":"false";
	}
}
