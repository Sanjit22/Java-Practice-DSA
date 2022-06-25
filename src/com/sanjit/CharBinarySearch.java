//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class CharBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		char[] arr = new char[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		
		System.out.println(Arrays.toString(arr));
		
		char target = sc.next().charAt(0);
		
		System.out.println(searchElement(arr, target));
	}

	static char searchElement(char[] arr, char target) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(target >= arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return arr[start % arr.length];
	}

}
