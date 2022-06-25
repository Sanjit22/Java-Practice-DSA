import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		rearrange(arr, n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");;
		}
	}
	
	public static void rearrange(int arr[], int n){
        
        // Your code here
        int newArr[] = new int[n];
        
        int temp=0;
        int temp2 =0;
        int i = 0;
        int j = n-1;
        int k =0;
        
        while(i<j){
        	newArr[k] = arr[j];
            newArr[k+1] = arr[i];
            i++;
            j--;
            k=k+2;
        }
        
        if(i==j) {
        	newArr[k] = arr[i];
        }
        

	    for(int l=0;l<n;l++){
	    	arr[l] = newArr[l];
	    }

    }
}
