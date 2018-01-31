package com.main.java;

public class LinkedNode {

	public LinkedNode next;
	public String data;
	
	
	public LinkedNode(LinkedNode next,String data){
		
		this.next = next;
		this.data = data;
		
	}
	
	public String toString(){
		
		return data;
	}
}
