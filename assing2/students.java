package com.sunbeam;

public class students {
	String name;
	int marks;
	int rollno;
	
	public void students1(int marks,String name,int rollno) {
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;
	}



	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + ", rollno=" + rollno + "]";
	}

}
