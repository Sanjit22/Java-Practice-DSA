import java.lang.reflect.Array;
import java.util.Scanner;

public class MaximumMinimum {
	

	public static void main(String[] args) {
		System.out.println("Enter the array size: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int arr[] = new int[number];
		for(int i=0;i<number;i++) {
			arr[i] = sc.nextInt();
		}
		
		int start = 0;
		int end = number-1;
		
		minMax(arr,start,end);
		
		//sorting(arr, start, end);
		
		//printing(arr, start, end);
		
		//System.out.println("Maximum number : " + arr[end]);
		//System.out.println("Minimum number : " + arr[start]);
	}

	private static void printing(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		for(int i=0;i<=end;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	private static void sorting(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<end;i++) {
			for(int j=0;j<end-i;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static void minMax(int[] arr, int start, int end) {
		int maximum=0;
		int minimum=0;
		for(int i=1;i<=end;i++) {
			if(arr[0]<arr[i]) {
				arr[0] = arr[i];
				maximum = arr[0];
			}
		}
		System.out.println("Maximum: " + maximum);
		//System.out.println("Minimum: " + minimum);
	}
	
	
}
