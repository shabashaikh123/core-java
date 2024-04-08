package com.tns.exception;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d=0;
try {
int a=42/d;//exception occured
System.out.println("hello everyone");//will not be executed
}
catch(ArithmeticException ob) {//exception handle
	System.out.println("exception is caught"+ob);
}



catch(ArrayIndexOutOfBoundsException ob) {//exception handle
	System.out.println("exception is caught"+ob);
}




catch(NullPointerException ob) {//exception handle
	System.out.println("exception is caught"+ob);
}

finally {
System.out.println("will not be printed");
	}

}
