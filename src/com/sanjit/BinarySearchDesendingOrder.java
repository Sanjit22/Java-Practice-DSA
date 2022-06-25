package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDesendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int target = sc.nextInt();
		
		System.out.println(searchElement(arr, target));
	}
	
	static int searchElement(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		int mid;
		
		while(start <= end ) {
			mid = start + (end-start) /2;
			if(arr[mid] == target) {
				return mid+1;
			}
			else if (target > arr[mid]) {
				end = mid-1;
				
			}
			else {
				start = mid+1;
			}
		}
		
		return -1;
	}

}
