package Day13;

import java.util.Scanner;

public class TryCatch2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array");
		
		int a = sc.nextInt();
		
		array(a);
	}

	private static void array(int a) {
		try {
			int arr[] = {1,2,3,4,5,6,7,8};
			System.out.println("Value at index is " +arr[a]);
			
		}
		catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
}

