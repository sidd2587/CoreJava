package com.main.java;

import java.util.concurrent.locks.LockSupport;

public class Test {
	
	public static void main(String[] args){
		isUniqueChars2("aman");
		LockSupport.park();
		
		System.out.println((6/100)%1234);
		
		
		String s3 = "Java String Quiz";
		System.out.println(s3.charAt(s3.toUpperCase().length()));
	}

	  public static boolean isUniqueChars2(String str) {
		  boolean[] char_set = new boolean[256];
		  for (int i = 0; i < str.length(); i++) {
		  int val = str.charAt(i);
		  if (char_set[val]) return false;
		  char_set[val] = true;
		  }
		  return true;
		  }
}
