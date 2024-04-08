package com.tns.multipleinherit;

public class Hybridcar implements CngCar,PetrolCar {

	@Override
	public void petrolKit() {
		// TODO Auto-generated method stub
		System.out.println("using petrolkit to drive hybrid");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("  hybrid car drive");
	}

	@Override
	public void cngKit() {
		// TODO Auto-generated method stub
		System.out.println("using cngkit to drive hybrid");
	}

	
	
	

}
