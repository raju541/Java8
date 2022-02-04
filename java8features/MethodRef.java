package com.cts.java8features;

public class MethodRef {
	
	public void add(int x, int y) {
		System.out.println("add: "+(x+y));
	}
	public static void sub(int x, int y) {
		System.out.println("sub: "+(x-y));
	}
	public static void mul(int x, int y) {
		System.out.println("mul: "+(x*y));
	}
	public static void div(int x, int y) {
		System.out.println("div: "+(x/y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRef mf=new MethodRef();
		FuncInterface add=mf::add;						
		//FuncInterface fin=new MethodRef()::add;		//instance
		add.operation(5, 5);
		
		FuncInterface sub=MethodRef::sub;				//static
		sub.operation(5, 5);
		
		FuncInterface mul=MethodRef::mul;				
		mul.operation(5, 5);
		
		FuncInterface div=MethodRef::div;				
		div.operation(5, 5);
		
	}

}
