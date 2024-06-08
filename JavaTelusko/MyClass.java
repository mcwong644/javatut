// https://youtu.be/h7piyWnQbZA?si=VMKsQiwr-TL24fdC
// Java Generics Tutorial

public class MyClass <T, V> {

    T ob;
    V ob2;

    MyClass(T ob, V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    void showType() {
        String n1=ob.getClass().getName();
        String n2=ob2.getClass().getName();
        System.out.printf("Type of var is %s\n",n1);    
        System.out.printf("Type of var is %s\n\n",n2);    
    }


    
}
