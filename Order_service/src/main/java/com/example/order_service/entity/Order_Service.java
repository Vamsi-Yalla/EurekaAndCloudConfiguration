package com.example.order_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ORDER_DB")
public class Order_Service {

	@Id
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity; 
	

}

