package com.tns.userdefined;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner obj=new Scanner(System.in);
		String name,city;
		int id;
		
		System.out.println("enter the name");
		name=obj.nextLine();
		
		System.out.println("name is="+name);
		//read an integer value from the use
		System.out.println("enter the id");
		id=obj.nextInt();
		System.out.println("id is="+id);
		
	}

}
