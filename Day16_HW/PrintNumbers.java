package Day16_HW;

public class PrintNumbers extends Thread {
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println("Number: " +i);
        }
    }

    public static void main(String[] args) {
        PrintNumbers no = new PrintNumbers();
        no.start(); 
    }
}

