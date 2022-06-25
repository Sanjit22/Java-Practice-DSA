import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long arr[] = new long[T];
		
		for(int i=0;i<T;i++) {
			long N = sc.nextLong();
			long reminder1;
			long result = 0;
			
			reminder1 = N % 10;
			while(N/10!=0) {
				N = N/10;
			}
			result = reminder1 + N;
			arr[i] = result;	
		}
		
		for(int j=0;j<T;j++) {
			System.out.println(arr[j]);
		}
	}

}
