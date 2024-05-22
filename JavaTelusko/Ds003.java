// import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Ds003 {
    // Priority Queue
    // 
    public static void main(String[] args) {
        Queue<Double> q = new LinkedList<>();
        
        q.offer(3.0);
        q.offer(2.5);
        q.offer(4.0);
        q.offer(1.5);
        q.offer(2.0);

        System.out.println(q);
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        
        }

    // change to PriorityQueue<Double>
    Queue<Double> q2 = new PriorityQueue<>();   
    q2.offer(3.0);
    q2.offer(2.5);
    q2.offer(4.0);
    q2.offer(1.5);
    q2.offer(2.0);

    System.out.println(q2);
    while (!q2.isEmpty()) {
        System.out.println(q2.poll());
    
    }

    Queue<Double> q3 = new PriorityQueue<>(Collections.reverseOrder());   
    q3.offer(3.0);
    q3.offer(2.5);
    q3.offer(4.0);
    q3.offer(1.5);
    q3.offer(2.0);

    System.out.println(q3);
    while (!q3.isEmpty()) {
        System.out.println(q3.poll());
    
    }



    }
}
