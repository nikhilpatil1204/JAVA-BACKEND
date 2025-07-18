package Day13;

import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);

    	try {
    		
    		System.out.println("Enter a size");
    		
    		int size = sc.nextInt();
    		
    		int arr[] = new int[4];
    		
    		for(int i=0; i<size; i++) {
    			System.out.println("Enter value for index " + i + ":");
    			arr[i] = sc.nextInt();
    		}
    		
    	}
    	catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
    		System.out.println("");
			System.out.println(e.getMessage());
    	}
    }
}
