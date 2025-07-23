package Day16_HW;

public class CountdownTimer {
    public static void main(String[] args) {
        System.out.println("Countdown starting...");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }

        System.out.println("Time's up!");
    }
}