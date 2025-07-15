package Day10;

import java.util.Scanner;

public class Overloading {
	public static void m1(int a, int b) {
		int result = a+b;
		System.out.println("Addition is: "+result);
	}
	
	public static void m1(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Addition is: "+result);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st no: ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int b = sc.nextInt();
		
		System.out.println("Enter 3rd no: ");
		int c = sc.nextInt();
		
		m1(a, b);
		m1(a, b, c);
		
	}
}
