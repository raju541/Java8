package com.cts.lambdaexp;

public class Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A msg=() -> {
			return "Hello";
		};
		
		System.out.println(msg.print());
	}

}
