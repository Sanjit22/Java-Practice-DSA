package com.sanjit;

import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		//System.out.println(Arrays.toString(reverse(arr, size)));
		
		//System.out.println(Arrays.toString(reverse(arr)));
		
		System.out.println(Arrays.toString(reverseToPointer(arr)));
		
	}
	
	static int[] reverse(int[] arr, int size) {
		int temp;
		for(int i=0; i<size/2; i++) {
			int index = size-i-1;
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		return arr;
	}
	
	static int[] reverse(int[] arr) {
		int temp;
		int size = arr.length;
		for(int i=0; i<size/2; i++) {
			int index = size-i-1;
			swap(arr, i, index);
		}
		
		return arr;
	}
	
	static int[] reverseToPointer(int[] arr) {
		int start = 0;
		int end = arr.length -1;
		
		while(start < end) {
			swap(arr, start, end);
			start++;
			end--;
		}
		
		return arr;
	}
	
	static int[] swap(int[] arr, int start, int end) {
		int temp;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		return arr;
	}

}
