package com.sanjit;

import java.util.Scanner;

public class ContinuesAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		String choice = sc.next();
		while(true) {
			if(!choice.equals("q")) {
				int number = Integer.parseInt(choice);
		        sum = sum+number;
		        break;
			}
		}
		System.out.println(sum);
	}

}
