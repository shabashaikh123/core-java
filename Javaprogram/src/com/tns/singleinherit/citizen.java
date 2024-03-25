package com.tns.singleinherit;
//base class
public class citizen {
   private String name;
   private String adharno;
   private long phoneno;
   
   //default construction
public citizen() {
	super();
}
//parameterize constuction
public citizen(String name, String adharno, long phoneno) {
	super();
	this.name = name;
	this.adharno = adharno;
	this.phoneno = phoneno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdharno() {
	return adharno;
}
public void setAdharno(String adharno) {
	this.adharno = adharno;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "citizen [name=" + name + ", adharno=" + adharno + ", phoneno=" + phoneno + "]";
}
      

   
   
}
