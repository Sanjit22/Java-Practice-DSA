/*
 * Array size = 5
   Array Elements = 78 9 659 3456 90
   Even no of Digit = 3 	//Even Digit = 78, 3456, 90
 */

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.sanjit;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(findNumbers(arr));
	}
	
	static int findNumbers(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			if(even(num)) {
				count++;
			}
		}
		return count;
	}

	static boolean even(int num) {
		// TODO Auto-generated method stub
		int noOfDigits = digits(num);
		if(noOfDigits%2 == 0) {
			return true;
		}
		return false;
	}

	static int digit(int num) {
		// TODO Auto-generated method stub
		if(num < 0) {
			num = num * -1;
		}
		
		if(num == 0) {
			return -1;
		}
		
		int count = 0;
		while(num > 0) {
			num = num/10;
			count++;
		}
		return count;
	}
	
	static int digits(int num) {
		if(num < 0) {
			num = num * -1;
		}
		return (int) (Math.log10(num)) + 1;
	}
	
	
	/*
	static int findNumbers(int[] arr) {
		int count=1;
		int no=0;
		for(int i=0; i<arr.length; i++) {
			int q = arr[i];
			while(q >= 10) {
				q = q/10;
				count++;
			}
			
			if(count%2 == 0) {
				no++; 
			}
			count=1;
		}
		
		return no;
	}
	*/

}
