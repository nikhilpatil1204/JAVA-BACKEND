package Day16_HW;

public class PrintDelay extends Thread {
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
    	PrintDelay d = new PrintDelay();
        d.start(); 
    }
}
