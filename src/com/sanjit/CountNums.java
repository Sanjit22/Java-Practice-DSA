package com.sanjit;

import java.util.Scanner;

public class CountNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int key = sc.nextInt();
		
		int temp;
		int r;
		int count=0;
		while(number != 0) {
			temp = number/10;
			r = number % 10;
			if(r == key) {
				count++;
			}
			number = temp;
		}
		
		System.out.println(count);
	}

}
