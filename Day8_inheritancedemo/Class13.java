package Day8_inheritancedemo;

public class Class13 {

	public void prime(int num) {
		if (num <= 1) {
		    System.out.print("Entered number is not a Prime number");
		}
		else {
			if(num == 2) {
				System.out.println("Entered number is neither Prime number nor composite");
			}
			else {
				for (int i = 2; i < num; i++) {
					
					if (num % i == 0) {
				        System.out.println("Number is not a Prime number");
				        break;
				    }
				    System.out.println("Number is a Prime number");
				    break;
				}
			}
		}
	}
	
}
