import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[n];
		
		int result = 0;
		for(int j=0;j<n-1;j++) {
			if(arr[j]<arr[j+1]) {
				result = result + arr[j];
			}
			else {
				result = result + arr[j];
				break;
			}
		}
		
		

		System.out.println(result);
	}

}
