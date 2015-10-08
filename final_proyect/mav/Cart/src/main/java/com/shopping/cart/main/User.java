package com.shopping.cart.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
@Entity
@Table(name="CART.USERS")
public class User {
	
	@Id
    @Column(name="ID")
	@GeneratedValue
	private Integer id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="ROLE")
	private String role;
	
	public User(){}
	
	public User(String username,String password,String role){
		
		this.username=username;
		this.password=password;
		this.role=role;
	}
		
	public Integer getId(){
		return id;
	}
	
	public void setId(Integer id){
		this.id=id;
	}
	
	public String getUsername(){
		return username;
	}
		
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password=password;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole(String role){
		this.role=role;
	}
}
