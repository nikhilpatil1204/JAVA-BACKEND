package Day13;

import java.util.Scanner;

public class TryCatch4 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		try {
			System.out.println("Enter a value: ");
			int a = sc.nextInt();
			System.out.println("Entered value is: " +a);
		}
		catch(Exception e){
//			e.getMessage();
//			e.printStackTrace();
			System.out.println("InputMismatchException " +e.getMessage());
		}
	}
	
	
}
