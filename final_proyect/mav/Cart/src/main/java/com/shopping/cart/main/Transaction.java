package com.shopping.cart.main;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CART.TRANSACT")
public class Transaction {
	
	@Id
    @Column(name="TRANSACTID")
	@GeneratedValue
	private Integer trId;
	@Column(name="USERS")
	private String user;
	@Column(name="ORDERID")
	private Integer orderId;
	@Column(name="TOTAL")
	private double total;
	@Column(name="DATES")
	private Date day;
		
	public Transaction(){}
	
	public Transaction(Integer orderId, String user,double total,Date day){
		this.orderId=orderId;
		this.user=user;
		this.total=total;
		this.day=day;
	}
	
	
	public double getTotal(){
		return total;
	}
	
	public void setTotal(double total){
		this.total=total;
	}
	
	public Integer getTrId(){
		return trId;
	}
	
	public void setTrId(Integer trId){
		this.trId=trId;
	}
	
	public int getOrderId(){
		return orderId;
	}
	
	public void setOrderId(Integer orderId){
		this.orderId=orderId;
	}
	
	public Date getDay(){
		return day;
	}
	
	public void setDay(Date day){
		this.day=day;
	}
	
	public String getUser(){
		return user;
	}
	
	public void setUser(String user){
		this.user=user;
	}
	
	
}