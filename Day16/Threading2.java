package Day16;

import java.util.Scanner;

public class Threading2 extends Thread{

	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++) {
            System.out.print("Thread --> Enter value for index " + i + ": ");
            arr[i] = sc.nextInt();
        }
		
		System.out.println("");
		
		System.out.println("Array elements are:");
        for (int val : arr) {
            System.out.println(val);
        }
	}
	
	
	Threading2(int a, int b){
		System.out.println("This is Example of Threading With Parameterized Constructor ");
		int result = a+b;
		System.out.println("Result: "+result);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Threading2 t = new Threading2(50,40);
		t.start();
	}
}
