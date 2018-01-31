package com.main.ds;

public class SwapNumber<T extends Number> {
	T t;
	
	public SwapNumber(){
		
	}
	
	public static void main(String[] args){
		
		swapNum(23, 67);
	}
	
	public static void swapNum(int a, int b){
		System.out.println(" before swap >  a : " +a+ "  b : "+ b);
		a = a+b;
		b = a - b;
		
		a = a - b;
		
		System.out.println(" After swap >  a : " +a+ "  b : "+ b);

		
	}

}
