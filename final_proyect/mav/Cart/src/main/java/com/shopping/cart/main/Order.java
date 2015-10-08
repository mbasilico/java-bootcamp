package com.shopping.cart.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CART.ORDERS")
public class Order {
	@Id
    @Column(name="ORDERID")
	@GeneratedValue
	private Integer orderId;
	
	
	@JsonIgnore
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="CART.ORDER_PRODUCT", 
				joinColumns={@JoinColumn(name="ORDERID")}, 
				inverseJoinColumns={@JoinColumn(name="ID")})
	private Set<Product> products = new HashSet<Product>();
	
	
	
	public Order(){};
	
	public Order(Integer orderId){
		this.orderId=orderId;
		
	}
	
	
	
	public Integer getOrderId(){
		return orderId;
	}
	
	public void setOrderId(Integer orderId){
		this.orderId= orderId;}

	
		public Set<Product> getProducts() {
		return products;
	}
	
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
