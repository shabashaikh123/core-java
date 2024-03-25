package com.tns.singleinherit;
//derive class
public class student extends citizen {
  private int rollNo;
  private String collegeName;
  
  //default construction
public student() {
	super();
}
//parameterize cons

public student(int rollNo, String collegeName, String name, String adharno, long phoneno) {
	super(name, adharno, phoneno); //accessing parent class construction
	this.rollNo = rollNo;
	this.collegeName = collegeName;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getCollegeName() {
	return collegeName;
}

public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}

@Override
public String toString() {
	return "student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
			+ ", getCollegeName()=" + getCollegeName() + ", getName()=" + getName() + ", getAdharno()=" + getAdharno()
			+ ", getPhoneno()=" + getPhoneno() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

  
  }
