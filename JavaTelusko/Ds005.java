
// #6 (00:40:14) Dynamic Arrays- ArrayList in Java
// create our own dynamic array as exercise

// import java.util.ArrayList;

public class Ds005 {
    public static void main(String[] args) {
        // USE ArrayList 
        // ArrayList<Integer> al = new ArrayList<Integer>(5);
        // al.add(2);
        // al.add(3);
        // System.out.println(al);

        // *** create own dynamic array from DynamicArray.java ***
        DynamicArray da = new DynamicArray(5);
        System.out.println("capacity : "+da.capacity);
        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");

        // da.delete("A");
        // da.delete("B");
        // da.delete("C");
        

        // da.insert(0, "X");
        // da.delete("A");
        
        System.out.println("Search for C: "+da.search("C"));
        
        System.out.println(da); // toString is default, no need to type
        System.out.println("Size: "+da.size);
        System.out.println("Capacity: "+da.capacity);
        System.out.println("Empty: "+da.isEmpty());

        da.delete("A");
        da.delete("B");
        da.delete("C");
        
        System.out.println(da); // toString is default, no need to type
        System.out.println("Size: "+da.size);
        System.out.println("Capacity: "+da.capacity);
        System.out.println("Empty: "+da.isEmpty());
    }
}
