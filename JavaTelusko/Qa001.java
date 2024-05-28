import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Qa001 {
    // https://youtu.be/5pDkh_vCgdY?si=rmyq0y49u7M2zWJ-
    // Java Collections Framework-Part4 | ArrayList Concept | Hands-on

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // heterogeneous list. can contain any type of data
        ArrayList al = new ArrayList<>();
        al.add("Hello");
        al.add(200);
        al.add(true);
        al.add(2.5);
        al.add(1, "World");
        
        //use iterator to iterate through the list
        System.out.println("=====Retrieve with Iterator=====");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.size());
        
        // homogeneous list. can contain only one type of data
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Hello");
        al2.add("World");
        System.out.println(al2);
        System.out.println(al2.get(1));
        // int n;
        al2.forEach((n)->print(n));
        System.out.println(al2.size());

        ArrayList<Integer> al3 = new ArrayList<Integer>();
        al3.add(3);
        al3.add(4);
        al3.add(6);
        al3.add(9);
        al3.forEach((n)->printInt(n));
        al3.forEach((n)->System.out.println("system.out.println: "+n));

        for(int n: al3)
        {System.out.println("for: "+n);}
        System.out.println("Contains \'9\': "+al3.contains(9));

        // collections class methods
        Collections.sort(al3);
        System.out.println(al3);
        Collections.reverse(al3);
        System.out.println(al3);
        Collections.shuffle(al3);
        System.out.println(al3);

        System.out.println("=====Collections Methods=====");
        Collections.addAll(al3, 11, 22, 23, 14, 15);
        System.out.println(al3);
        Collections.sort(al3);
        System.out.println("Sort() "+al3);
        Collections.reverse(al3);
        System.out.println("Reverse() "+al3);
        Collections.shuffle(al3);
        System.out.println("Shuffle() "+al3);

        System.out.println("=====Retrieve with Iterator=====");
        it = al3.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
            
        }
        System.out.println();
        System.out.println("=====convert array to ArrayList using Arrays.asList=====");
        String[] arr = {"1","2","3","4","5"};;
        @SuppressWarnings("rawtypes")
        ArrayList al4 = new ArrayList(Arrays.asList(arr));
        System.out.println("ArrayList al4: "+al4);
        System.out.println("=====convert ArrayList to array using toArray=====");
        String[] arr2 = (String[]) al4.toArray(new String[al4.size()]);
        System.out.println("Array arr2: "+Arrays.toString(arr2));
        // System.out.println(arr2.toString()); // error
    }
    // printing student name 
    public static void print(String n) 
    { 
        System.out.println("Student Name is " + n); 
    } 

    public static void printInt(int n)
    {
        System.out.println("Student Age is " + n);
    }


}
