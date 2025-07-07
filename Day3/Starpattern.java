package Day3;

public class Starpattern {

	public static void main (String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	    System.out.println("");
		System.out.println("");
		
       for(int i=1; i<=5; i++) 
       {	
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
       
       System.out.println("");
	   System.out.println("");
       
       for(int i=5; i>=1; i--) 
       {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
       
       System.out.println("");
	   System.out.println("");
       
       int a = 5;
       for(int i=1; i<=a; i++) {
    	    for(int j=1; j<=a; j++) {
    	        if(i==1 || j==a || i==a ||j==1)
    	            System.out.print("*");
    	        else
    	            System.out.print(" ");
    	    }
    	    System.out.println();
    	}
      
       System.out.println("");
	   System.out.println("");
       
       int b = 5;
       for(int i=1; i<=b; i++) {
    	    for(int j=1; j<=b; j++) {
    	        if(i==1 || j==b || i==b || j==1 || i==j)
    	            System.out.print("*");
    	        else
    	            System.out.print(" ");
    	    }
    	    System.out.println();
    	}
       
	}
	
}
