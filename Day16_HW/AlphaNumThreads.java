package Day16_HW;

public class AlphaNumThreads {
	public static void main(String[] args) {
		Alphabets a= new Alphabets();
		Numbers n = new Numbers();

		a.start();
		n.start();
	}
}

class Alphabets extends Thread {
	 public void run() {
	     for (char c = 'A'; c <= 'Z'; c++) {
	         System.out.println("Alphabet: " + c);
	         try {
	             Thread.sleep(1000); 
	         } catch (Exception e) {
	        	 e.printStackTrace();
	         }
	     }
	 }
}


class Numbers extends Thread {
	 public void run() {
	     for (int i = 1; i <= 26; i++) {
	         System.out.println("Number: " + i);
	         try {
	             Thread.sleep(1000); 
	         } catch (Exception e) {
	        	 e.printStackTrace();
	         }
	     }
	 }
}

