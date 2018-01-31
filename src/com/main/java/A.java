package com.main.java;

public abstract class A {
	
	public int value = 0;
	
	public void printVal(){
		
		System.out.println(value);
	}
	
	public void addVal(){
		this.value += value;
	}
	
	
class B extends A{
	
	public B(A a){
		
		super();
	}
}
}
