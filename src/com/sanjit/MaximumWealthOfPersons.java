//https://leetcode.com/problems/richest-customer-wealth/

package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWealthOfPersons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(Arrays.toString(arr[i]));
		}
		
		System.out.println(" ");
		
		System.out.println(maximumWealth(arr));
	}
	
	static int maximumWealth(int[][] arr) {
		int maxWealth = 0;
		for(int i=0; i<arr.length; i++) {
			int total=0; 
			for(int j=0; j<arr[i].length; j++) {
				total = total + arr[i][j];
			}
			
			if(total > maxWealth) {
				maxWealth = total;
			}
		}
		
		return maxWealth;
	}

}
