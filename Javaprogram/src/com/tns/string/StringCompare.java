package com.tns.string;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="TNSIF";
String s2="TNSIF";
String s3=new String("TNSIF");
String s4=new String("TNSIF");
  

//== and equals
System.out.println("s1 is equal to s2"+(s1==s2));//true
System.out.println("s1 is equal to s3"+(s1==s3));//false
System.out.println("s3 is equal to s4"+(s3==s4));//false


System.out.println("s1 is equal to s2"+s1.equals(s2));//true
System.out.println("s1 is equal to s3"+s1.equals(s3));//true
System.out.println("s3 is equal to s4"+s3.equals(s4));//true


System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
System.out.println(s4.hashCode());

//compareTo
System.out.println(s1.compareTo(s4));
System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo("tnsif"));
System.out.println(s1.compareToIgnoreCase("tnsif"));
	}

}
