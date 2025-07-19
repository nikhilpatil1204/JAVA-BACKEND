package Day14;

import java.util.Scanner;

public class Throw {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter One Integer: ");
		
		int age = sc.nextInt();
	
		if(age < 0) {
			
			throw new ArithmeticException("Age is Invalid");
			
		}
		else {
			System.out.println("Age is Valid");
		}
		
	}
	
}
