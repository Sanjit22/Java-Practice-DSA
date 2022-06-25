package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[7];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int index1 = in.nextInt();
		int index2 = in.nextInt();
		
		/*
		for(int j=0; j< arr.length; j++) {
			System.out.println(arr[j]);
		}
		*/
		
		System.out.println(Arrays.toString(toSwap(arr, index1, index2)));
	}
	
	static int[] toSwap(int[] arr, int index1, int index2) {
		int temp;
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		return arr;
	}

}
