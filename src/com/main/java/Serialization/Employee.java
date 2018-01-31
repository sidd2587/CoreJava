package com.main.java.Serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private String name;
	
	public Employee(String name){
		
		this.name = name;
	}

	
	
	public String toString(){
		
		return "Employee : [name : "+name+ "]";
	}
}
