package com.sanjit;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fruit = sc.nextLine();
		
		switch(fruit) {
			case "Mango":
				System.out.println("King of fruits");
				break;
			case "Apple":
				System.out.println("A sweet red fruit");
				break;
			case "Orange":
				System.out.println("Round fruit");
				break;
			case "Grapes":
				System.out.println("Small fruit");
				break;
			default:
				System.out.println("Please enter a valid fruit");
		}	
	}

}
