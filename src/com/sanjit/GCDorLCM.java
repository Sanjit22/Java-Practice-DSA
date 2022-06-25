package com.sanjit;

import java.util.Scanner;

public class GCDorLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int temp;
		
		if(num1 > num2)
		{
			
		}
		else {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//Concept of GCD : https://www.youtube.com/watch?v=yHwneN6zJmU&ab_channel=NesoAcademy
		while(num2 != 0) {
			int rem = num1 % num2 ;
			num1 = num2;
			num2 = rem;
		}
		System.out.println(num1);
	}

}
