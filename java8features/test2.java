package com.cts.java8features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class test2 {

	public static void main(String[] args) {
	
	Emp e1=new Emp(1, "prasad");
	Emp e2=new Emp(2, "hari");
	Emp e3=new Emp(3, "kiran");
	
	List<Emp> list=Arrays.asList(e1,e2,e3);
	
	List<Integer> ldlist=list.stream().map(Emp::getEid).collect(Collectors.toList());
	Set<Emp> nmlist=list.stream().filter(x->x.getEname().equals("prasad")).collect(Collectors.toSet());
	Map<String,Integer> nmmap=list.stream().collect(Collectors.toMap(Emp::getEname, Emp::getEid));
	System.out.println(nmmap);
	ldlist.forEach(x->System.out.println(x));
	nmlist.forEach(x->System.out.println(x.getEname()+"  "+x.getEid()));
	}
	

}
