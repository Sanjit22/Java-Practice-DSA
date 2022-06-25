package com.sanjit;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		//System.out.println(num1);
		//System.out.println(num2);
		int num3;
		int i=1;
		while ( i <= size-2) {
			num3 = num1 + num2;
			//System.out.println(num3);
			num1 = num2;
			num2 = num3;
			i++;
		}
		System.out.println(num2);
	}

}
