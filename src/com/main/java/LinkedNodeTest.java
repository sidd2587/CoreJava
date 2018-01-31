package com.main.java;

import java.util.Scanner;

public class LinkedNodeTest {

	
	public static void main(String[] args){
		LinkedNode front= null;
		System.out.println(front);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = scanner.nextLine();
		front = addToFront(front, name);
		System.out.println(front);

		
		
		
		
	}
	
	
	public static LinkedNode addToFront(LinkedNode front,String data){
		
	
		LinkedNode temp = new LinkedNode(null, data);
		temp.next = front;
		front  = temp;
		
		return front;
		 
	}
}
