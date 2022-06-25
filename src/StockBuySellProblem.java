import java.util.Scanner;

public class StockBuySellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(maxProfit(arr));
	}
	
	
	static int maxProfit(int arr[]) {
		int maxProfit = 0;
		int minSoFar = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			minSoFar = Math.min(arr[i], minSoFar);
			int profit = arr[i] - minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		
		return maxProfit;
	}
}
