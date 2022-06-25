import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int value = 0;
		
		if(target%2==0) {
			value = target - 3;
			if(value<0) {
				value = 0;
			}
		}
		else {
			value = target - 1;
		}
		
		System.out.println(value);
	}

}
