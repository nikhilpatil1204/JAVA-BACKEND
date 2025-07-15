package Day9_Interface;

import java.util.Scanner;

public class ClassB extends ClassC{
	public void  storeproducts(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total number of products:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter product number " +(i+1)  +": ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter product to search: ");
		int prod = sc.nextInt();

		boolean found = false;

		for (int i = 0; i < size; i++) {
			if (arr[i] == prod) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("Product is available");
		} else {
			System.out.println("Product is not available");
		}
	}
}
