package com.sanjit;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int value;
		for(int i=1; i<=10; i++) {
			value = number * i;
			System.out.println(number + " X " + i + " = " +  value);
		}
	}

}
