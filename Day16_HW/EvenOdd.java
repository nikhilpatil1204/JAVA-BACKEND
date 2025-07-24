package Day16_HW;

public class EvenOdd {
    public static void main(String[] args) {
    	EvenNumber e = new EvenNumber();
      	e.even();
      	
    	OddNumber o = new OddNumber();
    	o.odd();
    }
}

class EvenNumber{
    public void even() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number: " + i);
            }
        }
    }
}


class OddNumber{
    public void odd() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number: " + i);
            }
        }
    }
}

