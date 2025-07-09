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
		
		
		System.out.print("Even & Positive numbers :");
		for(int i = 0; i < size; i++) {
			if(arr[i] > 0 && arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}

		System.out.print("Odd & Negative numbers :");
		for(int i = 0; i < size; i++) {
			if(arr[i] < 0 || arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		

//		for(int i = 0; i < size; i++) {
//			if(arr[i] > 0 && arr[i] % 2 == 0) {
//				System.out.println("Even & Positive no: " + arr[i]);
//			}
//			else if(arr[i] < 0 || arr[i] % 2 != 0) {
//				System.out.println("Odd & Negative no: " + arr[i]);
//			}
//		}
		
	}
		
}
	

