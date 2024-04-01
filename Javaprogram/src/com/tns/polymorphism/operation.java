package com.tns.polymorphism;

public class operation {
  void addition(int a, int b) {
	  int c;
	  c=a+b;
	  System.out.println("addition is" +c);
	  
  }
  void addition(float a, float b) {
	  float c;
	  c=a+b;
	  System.out.println("addtion is" +c);
	  
  }
  void addition()
  {
	  
  }
  
  void display() {
	  System.out.println("-------------display()------------");
	  
  }
  void display(String name) {
	  System.out.println("hello"+name);
	  
	  
  }
  void display( int n, String name) {
	  
  }
}

