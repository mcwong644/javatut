import java.util.ArrayList;
import java.util.LinkedList;

public class Ds006 {
    //#7 (01:04:37) LinkedLists vs ArrayLists

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            ll.add(i);
            al.add(i);
        }

        //********* LinkedList *********/
        // startTime = System.currentTimeMillis();
        startTime = System.nanoTime();
        // for (int i = 0; i < ll.size(); i++) {
        //     ll.get(i);
        // }
        // get from beginning
        // ll.get(0); 
        // get from middle
        // ll.get(500000);
        // get from end 
        // ll.get(999999);
        // remove
        // ll.remove(0);
        // ll.remove(500000);
        ll.remove(999999);

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList: \t" + elapsedTime + " nanoseconds");

        //********* ArrayList *********/
        startTime = System.nanoTime();
        // for (int i = 0; i < ll.size(); i++) {
        //     ll.get(i);
        // }
        // al.get(0);
        // al.get(500000);
        // al.get(999999); 
        // al.remove(0);
        // al.remove(500000);
        al.remove(999999);
        
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList: \t" + elapsedTime + " nanoseconds");

    }
}
