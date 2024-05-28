import java.util.LinkedList;
import java.util.List;

public class Qa002 {
    //https://youtu.be/1Eyartworbk?si=0aBNZ1daUlTtmIAd&t=1804
    // stop 37.10:00
    // LinkedList
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // declare a linked list heterogeneous list
        // LinkedList ll = new LinkedList();
        // declare a linked list homogeneous list
        // LinkedList<Integer> ll1 = new LinkedList<Integer>();
        // LinkedList<String> ll2 = new LinkedList<String>();
        
        LinkedList ll = new LinkedList<>();
        ll.add("Hello");
        ll.add(201);
        ll.add(true);
        ll.add(2.5);
        ll.add('A');
        ll.add(null);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println("=====remove last null element=====");
        // ll.removeLast();
        ll.remove(null);
        System.out.println(ll);
        System.out.println("=====remove element 3 and \"Hello\"=====");
        ll.remove("Hello");
        ll.remove(3);
        System.out.println(ll);
        System.out.println("=====addAll(0,ll) and addAll(ll)=====");
        ll.addAll(0, ll);
        ll.addAll(ll);
        System.out.println(ll);

    }
}
