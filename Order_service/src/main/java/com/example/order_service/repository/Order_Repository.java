package com.example.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order_service.entity.Order_Service;

public interface Order_Repository extends JpaRepository<Order_Service, Integer>{

}
