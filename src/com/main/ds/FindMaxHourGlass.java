package com.main.ds;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxHourGlass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();

		int[][] _2dArray = new int[6][6];
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6; j++) {

				_2dArray[i][j] = scan.nextInt();
			}

		}
		String s = new String("p");
		String s1 = new String("P");
		System.out.println(s1 = s);

		String s3 = "Java String Quiz";
		System.out.println(s3.charAt(s3.toUpperCase().length()));
		int sum = 0;
		int sumTmp = Integer.MIN_VALUE;
		for (int m = 0; m < 4; m++) {
			for (int z = 0; z < 4; z++) {
				sum = 0;

				sum += _2dArray[m][z] + _2dArray[m][z + 1] + _2dArray[m][z + 2];
				sum += _2dArray[m + 1][z + 1];
				sum += _2dArray[m + 2][z + 0] + _2dArray[m + 2][z + 1] + _2dArray[m + 2][z + 2];
				System.out.println(sum);

				if (sumTmp < sum)
					sumTmp = sum;
			}

		}
		System.out.println(sumTmp);

	}
}
