package com.tns.string;

public class StringDemo {
	public static void main(String args[]) {
		//string operation
		char c[]= {'I','N','D','I','A'};
		String s1= new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s2);
		
		String s3=new String("indian");
		String s4=s3.toUpperCase();
		System.out.println(s4);
		int n1=s4.length();
		System.out.println("Length of the String"+n1);
		 String s5=s4.trim();
		 System.out.println(s5);
		 System.out.println(s5.charAt(3));
		 
		System.out.println( s5.substring(1, 5));
		 System.out.println(s5.isEmpty());
		 
	}

}
