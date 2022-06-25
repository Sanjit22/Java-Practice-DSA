package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfNumber {

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
		
		System.out.println(ceilingElement(arr, target));
	}

	static int ceilingElement(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		
		if(target > arr[end]) {
			return -1;
		}
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return arr[mid];
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			} 
			else {
				end = mid -1;
			}

		}
		return arr[start];
	}

	}
