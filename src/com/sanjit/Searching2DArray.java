package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class Searching2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int target = sc.nextInt();
		
		System.out.println(Arrays.toString(searchingElement(arr, target)));
		
	}
	
	static int[] searchingElement(int[][] arr, int target) {
		int[] ans = new int[2];
		ans[0]=-1;
		ans[1]=-1;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				if(arr[row][col] == target) {
					ans[0] = row+1;
					ans[1] = col+1;
					return ans;
				}
			}
		}
		return ans;
	}

}
