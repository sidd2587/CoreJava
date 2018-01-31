package com.main.java;

public class StringTest {

	public static void main(String[] args){
		
		String s3 = "Java String Quiz";
		System.out.println(s3.charAt(s3.toUpperCase().length()-1));

		
		String s4 = "abc";
		String s5 = "def";
		System.out.println(s4.compareTo(s5));
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);	
		
//String t =  "Java String Quiz";
		String t = "Java"+1+2+"Quiz"+""+(3+4);
		System.out.println(t);

		System.out.println(t.substring(5, 6));
		
		
		String s8 = "abc";
		StringBuffer s9 = new StringBuffer(s1);
		System.out.println(s8.equals(s9));
		
			
		String s10 = null;
		System.out.println(s10); //line 2
		//System.out.println(s10.toString()); //line 3
	}
}
