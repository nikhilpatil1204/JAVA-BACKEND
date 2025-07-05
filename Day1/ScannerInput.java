package Day1;

import java.util.Scanner;

public class ScannerInput {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name ");
		System.out.println("Enter your Age");
		
		String name = sc.next();
		int age = sc.nextInt();
		
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		
	}
	
}
