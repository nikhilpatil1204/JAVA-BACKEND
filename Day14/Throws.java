package Day14;

import java.util.Scanner;

public class Throws {

	public static void checkMarks(int marks) throws InvalidMarksException{
		if(marks < 0 || marks > 100) {
			throw new InvalidMarksException("Marks should be in between 0 to 100");
		}
		else {
			System.out.println("Marks are Valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Marks: ");
			
			int marks = sc.nextInt();
			
			checkMarks(marks);
		} 
		catch (InvalidMarksException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
}

class InvalidMarksException extends Exception{
	public InvalidMarksException(String msg) {
		super(msg);
	}
}