import java.util.Scanner;

public class BinarySearchProblem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("No of Elements : ");
		int N = sc.nextInt();

		System.out.print("Elements : ");
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Search Element : ");
		int target = sc.nextInt();

		int result = binarySearch(arr, target);
		System.out.println("The nearest value of Target element is " + arr[result]);
		
	}

	private static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int low = 0;
		int high = n - 1;
		int mid =0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return low;
	}
}
