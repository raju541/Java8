package com.cts.lambdaexp;

public class Bclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B msg=(name) -> {
			return name;
		};
		System.out.println(msg.print("Hello"));
		
		B msg1= name -> {		//no parentheses
			return name;
		};
		System.out.println(msg1.print("Good Morning"));
	}

}
