package com.Fileio;

public class Date {
	public int mm;
	public int dd;
	public int yy;
	public Date(int mm, int dd, int yy) {
		this.mm = mm;
		this.dd = dd;
		this.yy = yy;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+"/"+mm+"/"+yy;
	}

}
