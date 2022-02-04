package com.cts.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("prasad","ravi","raju","kiran");
		for (String string : list) {
			if(string.equals("prasad")) {
			System.out.println(string);
			}
			
		}
		
		List<String> li=list.stream().filter(x->x.equals("prasad")).collect(Collectors.toList());
		System.out.println(li);
	}

}
