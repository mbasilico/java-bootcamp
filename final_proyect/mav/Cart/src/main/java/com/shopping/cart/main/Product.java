package com.shopping.cart.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CART.PRODUCT")
public class Product {
	
	@Id
    @Column(name="ID")
	@GeneratedValue
	private Integer id;
	@Column(name="NAME")
	private String name;
	@Column(name="PRICE")
	private double price;
	
	
	@JsonIgnore
	@ManyToMany(mappedBy="products")
	private Set<Order> orders = new HashSet<Order>();
	
	public Product(){};
	
	public Product(String name,double price){
		
		this.name=name;
		this.price=price;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id= id;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public Set<Order> getOrders() {
		return orders;
	}
	
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
}
