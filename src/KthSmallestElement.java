import java.util.Scanner;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("N : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("Arr [] : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("K : ");
		int k = sc.nextInt();
		
		int start = 0;
		int end = n-1;
		
		kthElementS(arr, start, end, k);
	}
	
	static void kthElement(int arr[], int start, int end, int k) {
		int temp;
		for(int i=0;i<end;i++) {
			for(int j=0;j<end-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Output : " + arr[k-1]);
	}
	
	static void kthElementS(int[] arr, int start, int end, int k) {
		int maximum = 0;
		for(int i=0;i<k;i++) {
			if(arr[i]>arr[i+1]) {
				maximum = arr[i+1];
			}
		}
		
		System.out.println("Output : " + maximum);
	}
}
