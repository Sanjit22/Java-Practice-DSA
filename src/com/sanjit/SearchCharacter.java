package com.sanjit;

import java.util.Scanner;

public class SearchCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char target = sc.next().trim().charAt(0);
		
		System.out.println(charPosition(name, target));
	}
	
	static boolean charPosition(String name, char target) {
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==target) {
				return true;
			}
		}
		return false;
	}

}
