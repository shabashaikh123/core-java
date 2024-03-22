package com.tns.constr;

import java.util.Scanner;

public class Customer1Demo {
	
	public static void main(String[] args) {
		
	
	 Scanner sc=new Scanner(System.in);
     String name, city;
     int id;
     System.out.println("read name, id,city");
     id=sc.nextInt();
     sc.nextLine();
     name=sc.nextLine();
     city=sc.nextLine();
     System.out.println("the detail are "+name + " ," +city+ " ,"+id);
     Customer1 c=new Customer1();    //default construction 
     System.out.println(c);
     c.setCustomerId(id);
     c.setCustomerName(name);
     c.setCustomerCity(city);
     System.out.println(c);
     Customer1 cob=new Customer1(id, city, name);
     System.out.println(cob);
     
}
}
