import java.util.LinkedList;

public class Ds004 {
    // #5 (00:26:51) Linked Lists
    // singly linked list and doubly linked list
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //as stack
        System.out.println("====LinkedList as Stack====");
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.push("F");

        System.out.println(list);
        
        System.out.println("pop last element LIFO: " + list.pop());
        System.out.println("After pop " + list);
        
        // as queue
        LinkedList<String> list2 = new LinkedList<String>();

        //as stack
        System.out.println("====LinkedList as Queue====");
        list2.offer("A"); // use offer() instead of add()
        list2.offer("B");
        list2.offer("C");
        list2.offer("D");
        list2.offer("F");

        System.out.println(list2);
        
        System.out.println("poll first element FIFO: " + list2.poll()); // use poll instead of pop()
        System.out.println("After poll " + list2);

        System.out.println("====LinkedList add(\"A\") into index 0====");
        
        list2.add(0, "A"); // insert into position 4
        System.out.println(list2);
        System.out.println("====LinkedList add(\"E\") into index 4====");
        list2.add(4, "E");
        System.out.println(list2);
        System.out.println("====LinkedList remove(\"E\")====");
        list2.remove("E");
        System.out.println(list2);

        System.out.println("indexof C: "+list2.indexOf("C"));
        System.out.println("peekfirst: "+list2.peekFirst());
        System.out.println("peeklast: "+list2.peekLast());
        list2.addFirst("0");
        list2.addLast("9");
        System.out.println("====LinkedList addFirst(\"0\") and addLast(\"9\")====");
        System.out.println(list2);
        System.out.println("====LinkedList removeFirst(\"0\") and removeLast(\"9\")====");
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);
    }

}
