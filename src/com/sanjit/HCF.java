package com.sanjit;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int hcf = (num1 * num2)/(GCD(num1, num2)); 		// hcf = (a X b)/gcf
		
		System.out.println(hcf);
	}
	
	//Concept of GCD : https://www.youtube.com/watch?v=yHwneN6zJmU&ab_channel=NesoAcademy
	public static int GCD(int num1, int num2) {
		int temp;
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		while(num2 != 0) {
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}	
		return num1;
	}

}
