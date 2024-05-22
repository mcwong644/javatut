import java.util.LinkedList;
import java.util.Queue;

public class Ds002 {
// #3 (00:11:45) Queues
// #4 (00:21:51) Priority Queues
// #5 (00:26:51) Linked Lists 

    public static void main(String[] args) {
        // Queue is an interface and NOT a class. 
        // cannot create an instance of Queue eg. Queue<String> queue = new Queue<String>();
        // Queue<String> queue = new LinkedList<String>(); 
        // Use instance of LinkedList instead of Queue
        Queue<String> queue = new LinkedList<String>();
        queue.add("Karen");
        queue.add("Steven");
        queue.add("Chad");
        queue.add("Harold");
        queue.add("Wong");
        queue.add("Jason"); // add() will throw exception if queue is full
        System.out.println(queue);
        queue.offer("Jeff"); // offer() wont throw exception if queue is full
        String s1= queue.poll(); // Poll() Retrieves and removes the head of this queue, or returns {@code null} if this queue is empty.
        System.out.println("polled :" +s1);
        String s2= queue.remove(); // throws exception if queue is empty unlike poll()
        System.out.println("removed :" +s2);
        System.out.println(queue);
        queue.element(); //Retrieves, but does not remove, the head of this queue.  This method
        System.out.println("element :" +queue.element());
        boolean b1=queue.isEmpty(); // from java.util.Queue (Collection class)
        System.out.println(b1);
        System.out.println(queue.size());
        System.out.println(queue.contains("Wong"));
    }

}
