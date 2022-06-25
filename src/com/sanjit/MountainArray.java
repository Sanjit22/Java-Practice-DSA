//https://leetcode.com/problems/peak-index-in-a-mountain-array/

package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class MountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(peakElement(arr));
	}

	static int peakElement(int[] arr) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int ans = 0;
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid]<arr[mid-1]) {
				ans = mid - 1;
				if(true) {
					end = mid - 1;
				}

			}
			else if(arr[mid]> arr[mid-1]){
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return ans;
		
	}

}
