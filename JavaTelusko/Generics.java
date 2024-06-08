// https://youtu.be/h7piyWnQbZA?si=VMKsQiwr-TL24fdC
// Java Generics Tutorial

public class Generics {

    public static void main(String[] args) {
    MyClass<Integer,String> ob1 = new MyClass<>(10,"Hello");
    MyClass<String,String> ob2 = new MyClass<>("Hello","World");
    MyClass<Double,Integer> ob3 = new MyClass<>(22.22, 33);

    
    ob1.showType();
    ob2.showType();
    ob3.showType();
    }

}
