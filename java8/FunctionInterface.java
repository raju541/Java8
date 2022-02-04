package com.cts.java8;

public class FunctionInterface implements Function{
		 
		public void method(String msg) {
			System.out.println(msg);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInterface fin=new FunctionInterface();
		fin.method("This is Functional Interface");
	}

}
