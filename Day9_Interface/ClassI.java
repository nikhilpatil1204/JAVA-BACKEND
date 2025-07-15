package Day9_Interface;

import java.util.Scanner;

public class ClassI {
	public void gradechecker() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks: ");
		
		int marks = sc.nextInt();
		
		if(marks >= 90) {
			System.out.println("You got A grade with "+marks+" marks");
		}
		else if(marks >= 80) {
			System.out.println("You got B grade with "+marks+" marks");
		}
		else if(marks >= 60) {
			System.out.println("You got C grade with "+marks+" marks");
		}
		else if(marks >= 35) {
			System.out.println("You got D grade with "+marks+" marks");
		}
		else {
			System.out.println("You are Failed!!");
		}
	}
}
