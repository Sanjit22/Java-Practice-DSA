import java.util.Scanner;

public class BinarySearch {

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
		
		int result = binarySearch(arr, searchElement);
		if(result==-1) {
			System.out.println("Search Element is not present in the list.");
		}
		else {
			System.out.println("Search element is present in the list at position " + (result+1));
		}
	}

	private static int binarySearch(int[] arr, int searchElement) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int low = 0;
		int high = n-1;
		
		while(low<=high) {
			int mid = (low + high)/2;
			if(searchElement == arr[mid]) {
				return mid;
			}
			else if(searchElement > arr[mid]) {
				low = mid+1;
			}
			else if(searchElement < arr[mid]) {
				high = mid-1;
			}
		}
		return -1;
	}

}
