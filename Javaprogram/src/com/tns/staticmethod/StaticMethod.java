package com.tns.staticmethod;
//static method
public class StaticMethod {

private int section;
private static int srNo;

static {
	System.out.println("Static block");
	srNo=100;
}

//default constructor
StaticMethod(){
	System.out.println("constructor");
	srNo++;
	section++;
}

//static method
static void display() {
	System.out.println("Static method");
	System.out.println("serial no"+srNo);
}
}
