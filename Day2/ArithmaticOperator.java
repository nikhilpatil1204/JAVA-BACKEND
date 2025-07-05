package Day2;

import java.util.Scanner;

public class ArithmaticOperator {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two no.");
		
		int one = sc.nextInt();
	    int two = sc.nextInt();
	    
	    int add = one+two;
	    int sub = one-two;
	    int mul = one*two;
	    int div = one/two;
	    int mod = one%two;
	    
	    System.out.println("Addition of Two no. is "+add);
	    System.out.println("Substraction of Two no. is "+sub);
	    System.out.println("Multiplication of Two no. is "+mul);
	    System.out.println("Division of Two no. is "+div);
	    System.out.println("Mod of Two no. is "+mod);
		
	}

}
