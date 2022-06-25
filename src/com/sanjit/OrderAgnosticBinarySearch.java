package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticBinarySearch {

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
		
		System.out.println(orderCheckingSearch(arr, target));
	}

	static int orderCheckingSearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int index = -1;
		if(arr[start] < arr[end]) {
			index = searchElementsByAcending(arr, target, start, end);
		}
		else {
			index = searchElementsByDecending(arr, target, start, end);
		}
		
		return index;
	}

	static int searchElementsByAcending(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return mid+1;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			} 
			else {
				end = mid -1;
			}
		}
		return -1;
	}

	static int searchElementsByDecending(int[] arr, int target, int start, int end) {
		// TODO Auto-generated method stub
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return mid+1;
			}
			else if(target > arr[mid]) {
				end = mid -1;
			} 
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
