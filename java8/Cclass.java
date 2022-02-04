package com.cts.java8;

public class Cclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C sum=(a,b)-> (a+b);
		
		int c=sum.add(5, 5);
		System.out.println(c);
		
		C sum1=(a, b)->{	return a+b;	};
		System.out.println(sum1.add(10, 10));
	
		C sum2=(int a, int b)->{	return a+b;	};
		System.out.println(sum2.add(15, 15));
		

		C sum3=(a, b)-> a+b;	
		System.out.println(sum3.add(20, 20));
	}
}
