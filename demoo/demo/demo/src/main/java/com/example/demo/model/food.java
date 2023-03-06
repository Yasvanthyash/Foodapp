package com.example.demo.model;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class food {
	
	@Id
	private int id;
	private String name;
	private String orders;
	private int quantity;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getorders() {
		return orders;
	}
	public void setorders(String orders) {
		this.orders = orders;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public food(int id, String name, int quantity, String orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
		this.quantity = quantity;
	}
	
	public food() {
		
	}
	
	@Override
	public String toString() {
		return "food [id=" + id + ", name=" + name + ", orders=" + orders + ", quantity=" + quantity + "]";
	}
	
	

}
