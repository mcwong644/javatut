import java.io.IOException;

public class Demo38 {

    // 10:47:45 Race Condition
    // 11:00:15 Thread states
    // 11:03:45 Collection API

    public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {

        Counter c = new Counter();

        Runnable A = () -> // Runnable interface
        {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        };
        Runnable B = () -> // Runnable interface
        {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }

        };
        Thread t1 = new Thread(A);
        Thread t2 = new Thread(B);
        t1.start();
        t2.start();

        t1.join();  
        t2.join();
        System.out.println(c.count);

    }
}

class Counter {
    int count;
    // use synchronized keyword
    public synchronized void increment() {
        count++;
    }
}