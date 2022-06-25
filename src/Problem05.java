import java.util.Scanner;

public class Problem05 {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc = new Scanner(System.in);
		    int T = sc.nextInt();
		    long arr[] = new long[T];
		    
		    for(int i=0;i<T;i++){
		        long N = sc.nextInt();
		        long result = 1;
		        
		        if(N>=1){
		        	for(int j=1;j<=N;j++){
			        	result = result * j;
			        }
			        arr[i] = result;
		        }
		        else {
		        	arr[i] = result;
		        }
		    }
		    
		    for(int j=0;j<T;j++){
		        System.out.println(arr[j]);
		    }
		    
		}
		catch(Exception e){
		    return;
		}
	}

}
