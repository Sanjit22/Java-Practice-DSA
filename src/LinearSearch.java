import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int searchElement) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == searchElement) {
				return i+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No of Elements : ");
		int N = sc.nextInt();
		
		System.out.print("Elements : ");
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Search Element : ");
		int searchElement = sc.nextInt();
		
		int result = linearSearch(arr, searchElement);
		if(result==-1) {
			System.out.println("Search Element is not present in the list.");
		}
		else {
			System.out.println("Search element is present in location " + result);
		}
	}

}
