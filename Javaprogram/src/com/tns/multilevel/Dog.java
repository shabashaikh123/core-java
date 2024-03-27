package com.tns.multilevel;
//Dog class, subclass of Animal
public class Dog extends Animal {
	
	
	    String breed;

	    Dog(String breed) {
	        super("Dog");
	        this.breed = breed;
	    }

	    void sound() {
	        System.out.println("Woof!");
	    }
	}



