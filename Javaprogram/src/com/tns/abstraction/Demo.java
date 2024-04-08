package com.tns.abstraction;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Shape sh;
        sh=new Square(0.3f);//accesing thriugh implementable class
        sh.calArea();
        sh.show();
        sh=new Rectangle(0.2f,0.3f);
        sh.calArea();
        sh.show();
        
	}

}
