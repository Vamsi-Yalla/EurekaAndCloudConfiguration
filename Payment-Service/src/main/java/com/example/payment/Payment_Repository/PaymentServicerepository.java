package com.example.payment.Payment_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payment.enity.Payment_Service;

public interface PaymentServicerepository extends JpaRepository<Payment_Service, Integer> {

}
