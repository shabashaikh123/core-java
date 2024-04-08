package com.tns.interfaces;
//program to demonstrate interfaces
public interface Amazon {

	void welcome();
	void subscribe();//abstract
	
	 default void serviceCharge() 
	 {
		int amt=100;
		System.out.println("the service charge is"+amt);
		
	}
	static void aboutUs() {
		System.out.println("its a ecommerce website");
	}
}
