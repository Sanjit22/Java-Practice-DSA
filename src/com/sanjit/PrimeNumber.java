package com.sanjit;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(isPrime(number));

	}
	
	static boolean isPrime(int number) {
		int c = 2;
		while(c*c <= number) {
			if(number % c == 0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
