package com.tns.constr;

public class Customer1 {
	private int customerId;
	private String customerCity;
	private String customerName;
	//default construction
	
	
	
	public Customer1() {
		System.out.println("default construction");
	}
public Customer1(int customerId, String customerCity,String customerName) {
	System.out.println("parametriged constructor");
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerCity=customerCity;
}


	public int getCustomerId() {
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



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

    

	@Override
	public String toString() {
		return "Customer1 [customerId=" + customerId + ", customerCity=" + customerCity + ", customerName="
				+ customerName + "]";
	}
	
}
