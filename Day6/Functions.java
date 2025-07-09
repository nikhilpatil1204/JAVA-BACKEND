package Day6;

public class Functions {
	
	public static void evenodd() {
		
		for(int i=0; i<=50; i++) {
			if(i%2==0) {
				System.out.println("Even No:- "+i);
			}
			else {
				System.out.println("Odd No:- "+i);
			}
		}
	}
	
	public static void array() {
		int arr[] = {33, 8, 27, 3, 39};

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + ": " + arr[i]);
		}
	}
	
	public static void twoDimensionalarr() {
		int arr[][] = {
				{1,2,3,4,5},
				{5,6,7,8,10}
		};
		
		System.out.println(arr[1][3]);
	}
	
	public static void starpattern() {
		for(int i=1; i<=5; i++) 
	       {	
				for(int j=1; j<=5; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}
	
	public static void ascii() {
		for(char i='A'; i <='Z'; i++ ) {
			int j =  i;
			System.out.print(i+" " +j +"  ");
		}
		System.out.println("");
		System.out.println("");
		for(char i='a'; i <='z'; i++ ) {
			int j =  i;
			System.out.print(i+" " +j +"  ");
		}
	}
	
	public static void addition(int a, int b) {
		int add = a+b;
		System.out.println("Addition: "+add);
	}
	
	public static int substraction(int a, int b) {
		return a-b;
	}
	
	public static void multiplication() {
		int result = 12 * 4;
		System.out.println("Multiplication: "+result);
	}
	
	public int division(int a, int b){
		return a/b;
	}
	
	public static double divide(int a, int b) {
        return (double) a / b;
    }
	
	public static void printAll(int a, int b) {
        System.out.println("Addition of two no. is " + (a + b));
        System.out.println("Subtraction of two no. is " + (a - b));
        System.out.println("Multiplication of two no. is " + (a * b));
        System.out.println("Division of two no. is " + (a / b));
    }
	
	 public static void printNameFromAscii(int[] arr) {
	    for (int n : arr) {
	    	System.out.print((char) n);
	    }
	 }
	
	public static void main(String[]args) {
//		evenodd();
		
//		array();
		
//		twoDimensionalarr();
		
//		starpattern();
		
//		ascii();
		
//		addition(12,52);
		
//		substraction(60,33);
		
//		multiplication();
		
//		Functions div = new Functions();
//		int result = div.division(12, 4);
//		System.out.println("Division: " + result);
		
//		double result = divide(10, 4);
//      System.out.println("Result: " + result);
			
//		printAll(10, 2);
		
		int[] name = {78,73,75,72,73,76}; 
        printNameFromAscii(name);

	}
}
