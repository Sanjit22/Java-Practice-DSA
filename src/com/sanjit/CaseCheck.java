package com.sanjit;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().trim().charAt(0);
		System.out.println(ch);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase Character");
		}
		else {
			System.out.println("Uppercase Character");
		}
	}

}
