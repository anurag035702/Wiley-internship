package com.Fileio;

import java.io.Serializable;

public class Student_ser implements Serializable {
	int rno;
	String Name;
	String sec;
	transient Date dateofadm;// not include this in serialization
	public Student_ser(int rno, String name,String sec,Date dateofadm) {
		super();
		this.rno = rno;
		Name = name;
		this.sec=sec;
		this.dateofadm=dateofadm;
	}
	public void setDt(Date d) {
		this.dateofadm=d;
	}

	

}
