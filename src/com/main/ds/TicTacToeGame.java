package com.main.ds;

import java.util.Arrays;

public class TicTacToeGame {
	
	public static void main(String[] args){
		
		
		int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};
            
            for(int[] input : test){
            	
            	
            	System.out.println(Arrays.toString(input));
            }
            
            
            
            for(int i = 0;i < test.length;i++){
            	
            	
            	for(int a : test[i]){
                	System.out.println(a);

            	}
            }



	}

}
