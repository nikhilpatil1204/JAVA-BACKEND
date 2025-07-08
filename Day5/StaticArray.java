package Day5;

import java.util.Scanner;

public class StaticArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Array index is " +i);
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +",");
		}
		
	}
	
}
