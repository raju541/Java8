package com.cts.java8features;

public class TestFi {
	
	public static void calculate(int a,int b,FuncInterface fr) {
		
		 fr.operation(a, b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface add = (x,y)-> System.out.println(x+y);
		FuncInterface mul = (x,y)-> System.out.println(x*y);
		FuncInterface dif = (x,y)-> System.out.println(x-y);
		FuncInterface div = (x,y)-> System.out.println(x/y);
		
		calculate(5,5,add);
		calculate(5,5,mul);
		calculate(5,5,dif);
		calculate(5,5,div);
		
		//obj.abstractFun(5,6);
		
		
	}

}
