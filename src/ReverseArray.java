//Reverse the array

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many number you want to give?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the numbers : ");
		int arr[] = new int[n];
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int k=n-1; 
		int temp;
		for(int j=0;j<n/2;j++) {
			temp = arr[j];
			arr[j] = arr[k-j];
			arr[k-j] = temp;
		}
		System.out.println("Reverse the Array : ");
		for(int l : arr) {
			System.out.print(l + " ");
		}
	}

}
