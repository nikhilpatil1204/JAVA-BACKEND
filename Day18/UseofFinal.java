package Day18;

public class UseofFinal {
	
	 final int one =40;
	  
     public static void main(String[] args) {
    	 One n = new One();
    	  System.out.println(n.one);
//    	  System.out.println(n.one2);
    	  n.m1();
	 }
}


final class One {
	final int one=20;
	 final void m1() {
		  System.out.println("Class Mains");
	  }
}