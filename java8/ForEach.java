package com.cts.java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<>();
		list.add("Raju");
		list.add("Hari");
		list.add("Chandu");
		list.add("Ali");
		
		list.forEach((n)->
		System.out.println(n)
		);
	}

}
