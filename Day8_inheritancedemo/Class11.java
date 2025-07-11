package Day8_inheritancedemo;

import java.util.Scanner;

public class Class11 extends Class12{

	public void staticArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of an array ");
		
		int size = sc.nextInt();
		
		int arr1[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Array Index "+i);
			
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("The full array is: ");

		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] +" ");
		}
	}
	
}
