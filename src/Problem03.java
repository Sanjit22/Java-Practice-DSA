import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) throws java.lang.Exception {
		// TODO Auto-generated method stub
		try{
	        Scanner sc = new Scanner(System.in);
    	    int T = sc.nextInt();
    	    long arr[] = new long[T];
    	    for(int i=0;i<T;i++){
    	        long N = sc.nextLong();
    	        
    	        long temp = 0;
    	        while(N!=0){
    	            long reminder = N%10;
    	            temp = temp + reminder;
    	            N=N/10;
    	        }
    	        arr[i]=temp;
    	    }
    	    
    	    for(int j=0;j<T;j++) {
    	    	System.out.println(arr[j]);
    	    }
	    }
	    catch(Exception e){
	        return;
	    }
	}

}
