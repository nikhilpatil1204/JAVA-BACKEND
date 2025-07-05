package Day2;

import java.util.Scanner;

public class ContitionalOperator {
	
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.");
		
		int no = sc.nextInt();
		
		if(no % 2 == 0 ) {
			System.out.println("Even no. : "+no);
		}
		else {
			System.out.println("Odd no. : "+no);
		}
		
	}
	
}
