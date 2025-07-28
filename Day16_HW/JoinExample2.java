package Day16_HW;

class MyTask {
    void firstMethod() {
        System.out.println("First method is running...");
    }

    void secondMethod() {
        System.out.println("Second method is running...");
    }
}

public class JoinExample2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread secondThread = new Thread(() -> {
            task.secondMethod();
        });

        Thread firstThread = new Thread(() -> {
            task.firstMethod();
        });

       
        secondThread.start();

        try {
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        firstThread.start();
    }
}