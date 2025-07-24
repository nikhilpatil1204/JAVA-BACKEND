package Day16_HW;

public class TurtleRabbitRace {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        Rabbit r = new Rabbit();

        t.start();
        r.start();
    }
}

class Turtle extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Turtle step: " + i);
            try {
                Thread.sleep(500); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
        System.out.println("Turtle finished the race!");
    }
}


class Rabbit extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rabbit step: " + i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
            	e.printStackTrace();
            }
        }
        System.out.println("Rabbit finished the race!");
    }
}

