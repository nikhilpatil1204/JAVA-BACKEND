package Day2;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		boolean isPrime = true;
		
		if (num <= 1) {
            System.out.println(num + " is not a prime number.");
        } 
		else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
		
	}
	
}
	


