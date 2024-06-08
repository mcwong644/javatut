import java.util.ArrayList;
import java.util.List;

//https://youtu.be/JY8-UMQ7vmY?si=5gdZRM3AD3QefS7Q

public class G01Generic <T> {
    public static void main(String[] args) {
        G01Counter<Integer> iCounter = new G01Counter<>(10);
        iCounter.print();   
        G01Counter<String> sCounter = new G01Counter<>("Hello");
        sCounter.print();
        G01Counter<Double> dCounter = new G01Counter<>(10.5);
        dCounter.print();

        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(22);
        iList.add(20);
        iList.add(10);

        // not recommended to use Object type
        ArrayList<Object> oList = new ArrayList<>();
        oList.add(33);
        oList.add(44.5);
        oList.add("Hello");
        oList.add(iList); //add arraylist to olist

        Integer i = (Integer) iList.get(0);
        System.out.println(i);
        Double d = (Double) oList.get(1);
        System.out.println(d);
        String s = (String) oList.get(2);
        System.out.println(s);


        @SuppressWarnings("unchecked")
        ArrayList<Integer> iList2 = (ArrayList<Integer>) oList.get(3);
        System.out.println(iList2);

        print(iList2);
        print(oList);
        print(oList.get(1));
        print(iList, oList.get(1));

        // print2(iList.get(0)); Error: incompatible types: possible lossy conversion from int to Object
        print2(oList);

    }

    // Generic method
    private static <T> void print(T t) {
        System.out.println(t);
    }
    // generic method with 2 arguments
    private static <T,V> void print(T t,V v) {
        System.out.println(t+""+v);
    }
    
    private static void print2(List<?> list) {
        System.out.println(list);
        
    }
 
}
