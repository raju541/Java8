package com.cts.java8features;

import java.util.List;

public class Emp {
	
	int eid;
	private String ename;
	
	public Emp(int id,String name) {
		this.eid=id;
		this.ename=name;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+"  : "+ename;
	}

	
}
