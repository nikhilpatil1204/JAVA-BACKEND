package Day16_HW;

public class EvenOdd {
    public static void main(String[] args) {
    	EvenNumber e = new EvenNumber();
      	e.start();
      	
    	OddNumber o = new OddNumber();
    	o.start();
    }
}

class EvenNumber extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
        }
    }
}


class OddNumber extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number: " + i);
            }
        }
    }
}

