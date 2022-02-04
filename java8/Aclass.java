package com.cts.java8;

public class Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A msg=() -> {
			return "Hello";
		};
		
		System.out.println(msg.print());
	}

}
