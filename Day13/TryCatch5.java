package Day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter 1st no. : ");
            int a = sc.nextInt();

            System.out.print("Enter 2nd no. : ");
            int b = sc.nextInt();

            int result = a/b;
            System.out.println("Division is: " + result);

        } 
        catch (ArithmeticException e) {
//			e.getMessage();
//			e.printStackTrace();
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (InputMismatchException e) {
//			e.getMessage();
//			e.printStackTrace();
            System.out.println("Error: Please enter valid integers only.");
        }
        
        
	}
}

