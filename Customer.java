package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity is generally a tuple or represents a record in Database

@Entity
@Table(name="customers") //If table does not exist then it creates one
public class Customer {
	
	@Id //acts like a primary key
	@Column(name="cust_Id") //The name of ID should be this in the database
	private int custId;
	
	@Column(name="cname", length=30)
	private String custName;
	
	@Column(length=15)
	private String city;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}