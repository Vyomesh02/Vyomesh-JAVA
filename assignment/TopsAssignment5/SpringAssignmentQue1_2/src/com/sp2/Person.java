package com.sp2;

public class Person {

	String pname;
	Phone phone;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public void callperson() {
		phone.callPhone();
		System.out.println("Pname is ..."+pname);
	}
}
