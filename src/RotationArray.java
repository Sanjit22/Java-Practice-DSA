import java.util.Scanner;

public class RotationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		rotateArr(arr, d, n);
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+ " ");
		}
		
	}
	
	static void rotateArr(int arr[], int d, int n) {
        // add your code here
        int N = n-d;
        int start1 = 0;
        int end1 = d;
        int start2 = d;
        int end2 = n;
        reverseArr(arr, start1, end1);
        reverseArr(arr, start2, end2);
        reverseArr(arr, start1, end2);
    }
    
    static void reverseArr(int arr[], int start, int end){
        int temp = 0;
        int i=start;
        int j=end-1;
        while(i<=j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
}
