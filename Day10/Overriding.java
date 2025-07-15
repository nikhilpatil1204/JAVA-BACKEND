package Day10;

import java.util.Scanner;

public class Overriding {

	public static void m1(int a, int b) {
		int result = a-b;
		System.out.println("Substraction is: "+result);
	}
	
   public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int b = sc.nextInt();
		
		Overriding.m1(a, b);
		Overriding2.m1(a, b);
		
	}
	
}

class Overriding2 {
	public static void m1(int a, int b) {
		int result = a*b;
		System.out.println("Multication is: "+result);
	}
}
