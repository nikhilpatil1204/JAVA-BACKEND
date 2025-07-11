package Day8_inheritancedemo;

import java.util.Scanner;

public class Inheritance extends Class1{

	public void function1(){
		System.out.println("Inheritance Example !!!");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1st no.");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter 2nd no.");
//		int b = sc.nextInt();
		
		System.out.println("Enter no.");
		int p = sc.nextInt();
		
		Inheritance i = new Inheritance();
		
//		i.evenodd();
		
//		i.array();
		
//		i.addition(a, b);
		
//		i.substraction(a, b);
		
//		i.gradechecker();
		
//		i.starpattern();
		
//		i.twoDArray();
		
//		i.threeDArray();
		
//		i.staticArray();
		
//		i.printnamefromascii();
		
//		i.multiplication();
		
//		i.division(15, 3);
		
		i.prime(p);
		
	}
	
}
