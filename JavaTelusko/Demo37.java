import java.io.IOException;

public class Demo37 {
    // 10:15:25 Threads 
    // 10:20:37 Multiple Threads 
    // 10:31:58 Thread Priority and Sleep 
    // 10:39:20 Runnable vs Thread 

    public static void main(String[] args) throws NumberFormatException, IOException {
        A a = new A();
        B b = new B();
        //Runnable is functional interface can create anonymous class
        // and use lambda expression
        Runnable c = ()->  // Runnable interface
        {
                for(int i=1; i<=100; i++) {
            System.out.println(i + " C..Yoohoo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }

        };

        b.setPriority(Thread.MAX_PRIORITY);

        System.out.println("a priority : "+a.getPriority());
        System.out.println("b priority : "+b.getPriority());

        Thread t = new Thread(c); //assign the Runnable object c to Thread object
        a.start();  // start the thread will need to execute run() method
        b.start();
        t.start();
        
    }
}

class A extends Thread {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(i + " A..Hi");
            try {
                Thread.sleep(10); // 10 milliseconds sleep
            } catch (InterruptedException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(i+ " B..Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

// class C implements Runnable{
//     public void run() {
//         for(int i=1; i<=100; i++) {
//             System.out.println(i + " C..Yoohoo");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 // Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }