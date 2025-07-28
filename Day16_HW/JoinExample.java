package Day16_HW;


class SlowRunner extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("SlowRunner step: " + i);
            try {
                Thread.sleep(800); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("SlowRunner finished the race!");
    }
}

class FastRunner extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("FastRunner step: " + i);
            try {
                Thread.sleep(300); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FastRunner finished the race!");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        SlowRunner slowRunner = new SlowRunner(); 
        FastRunner fastRunner = new FastRunner(); 

        fastRunner.start(); 

        try {
            fastRunner.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        slowRunner.start(); 
    }
}


