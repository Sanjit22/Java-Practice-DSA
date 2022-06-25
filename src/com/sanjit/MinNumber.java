package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(isMin(arr));
		
	}
	
	static int isMin(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}

}
