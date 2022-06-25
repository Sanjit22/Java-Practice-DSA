//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class SearchRangeProblem {

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
		
		System.out.println(Arrays.toString(searchRange(arr, target)));
	}

	static int[] searchRange(int[] arr, int target) {
		int[] ans = new int[2];
		ans[0] = position(arr, target, true);
		ans[1] = position(arr, target, false);
		
		return ans;
	}
	
	static int position(int[] arr, int target, boolean findStartIndex) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				ans = mid;
				if(findStartIndex) {
					end = mid -1;
				}
				else {
					start = mid + 1;
				}
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return ans;
	}

}
