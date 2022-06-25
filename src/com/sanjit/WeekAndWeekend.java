package com.sanjit;

import java.util.Scanner;

public class WeekAndWeekend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		switch(day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekdays");
				break;
			case 6:
			case 7:
				System.out.println("Weekends");
				break;
		}
	}

}
