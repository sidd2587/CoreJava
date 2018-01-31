package com.main.ds;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solutions {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner c = new Scanner(System.in);

        int num = c.nextInt();
        String[] sb = new String[num];

             int count = 0 ;
             
        	 while (c.hasNext()) {
        		 if(c.hasNextInt()){
        		     sb[count] = c.next();
        		     count++;
        		 }
        		
        		 
                    if(count == num){
                    	//System.out.println(sb.toString());
                    	break;
                    }
        		   }
        	 for(int a = sb.length - 1; a >= 0; a--){
        		 
        		 System.out.print(sb[a]+" ");
        	 }
        	// System.out.println(Arrays.toString(sb));
       /* for(int j = 0; j < num*2; j ++){
        	sb.append(c.next());
        	if(c.hasNext("\\s"))
        		sb.append(" ");
        	// System.out.println(c.next());
         }*/
   //	System.out.println(sb.toString());

      /*  sb.append(c.next());
        
        String[] str = (sb.toString()).split(" ");
       if(str.length == num){
           
           for(int i = str.length - 1;  i > str.length; i--){
            
            System.out.println(str[i]);
            
        }
       }
        */
        	 
        	/* for(int i = 1; i <= 20; i++) {
        		   System.out.print(" " + i);
        		   if(i % 10 == 0)
        		      System.out.print("\n");
        		}*/
    }}
