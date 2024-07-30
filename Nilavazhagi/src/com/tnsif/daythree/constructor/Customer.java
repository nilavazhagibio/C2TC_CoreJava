//program to demonstrate customer
package com.tnsif.daythree.constructor;

public class Customer {

	private String customerName;
	private int customerId;
	private String customerCity;
	
	// Default constructor
	public Customer ()  {
		System.out.println("Default Constructor");
	}
	
	//Parameterized Constructor
	//use of this keyword
	public Customer(String customerName, int customerId, String cutomerCity) {
		
		this(); //calling default constructor
		
		System.out.println("Parameterized Constructor");
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
		
	}
	
	//Getter and Setters
	public String getcustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getCustomerId(){
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerCity() {
		return customerCity;
	}
	
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity + "]";
		
		
		
	
	
	
	
	
	
	}
		
	}

