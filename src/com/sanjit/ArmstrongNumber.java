package com.sanjit;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start; i<end; i++) {
			if(isArmstrong(i) == true) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isArmstrong(int z) {
		int number = z;
		int rem;
		int sum = 0;
		while(number != 0) {
			rem = number % 10;
			number = number/10;
			sum = sum + (rem * rem * rem);
		}
		
		if(sum == z) {
			return true;
		}
		else {
			return false;
		}
	}

}
