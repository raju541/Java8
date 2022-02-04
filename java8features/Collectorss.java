package com.cts.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1=new Emp(1, "raju");
		Emp e2=new Emp(2, "hari");
		Emp e3=new Emp(3, "kiran");
		Emp e4=new Emp(4, "prasad");
		
		List<Emp> list=Arrays.asList(e1,e2,e3,e4);
		
		List<Emp> li=list.stream().filter(x->x.eid<3).collect(Collectors.toList());
		System.out.println(li);

	}

}
