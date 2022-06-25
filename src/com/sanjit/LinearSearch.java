package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int key = sc.nextInt();
		
		System.out.println(searchElement(arr, key));
		
	}
	
	static int searchElement(int[] arr, int key) {
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i] == key) {
				return i+1;
			}
		}
		
		return -1;
	}

}
