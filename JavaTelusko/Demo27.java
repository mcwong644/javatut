public class Demo27 {
    // 08:07:22 What is Interface 
    // 08:15:18 More on Interfaces 
    // 08:18:40 Need of Interface 
    public static void main(String[] args) {
        A obj = new MyClass();
        obj.show();
        obj.print();
        System.out.println("Age from interface: " + A.age);
        MyClass obj2 = new MyClass();
        obj2.test();
        MyClass2 obj3 = new MyClass2();
        obj3.show();
        obj3.print();
        obj3.test();
        }
    }

    interface A {
        int age=28; // default final and static
    // Interface methods are public and abstract by default
    void show();    // defaults to public abstract void show();
    void print();
    
}
interface B {
    void test();
}

interface Y extends A, B {
    // Add any additional methods or properties required for the Y interface
}
// use implements keyword to implement interface methods
class MyClass implements A,B {
    public void show() {
        System.out.println("Implementing show() method from MyInterface");
    }

    @Override
    public void test() {
        // Auto-generated method stub
        System.out.println(("Implementing test() method from interface B"));
        
    }

    public void print() {
        System.out.println("Implementing print() method from MyInterface");
    }
    
}

class MyClass2 implements Y {
    public void show() {
        System.out.println("Implementing show() method from interface A");
    }

    public void test() {
        System.out.println("Implementing test() method from interface B");
    }

    public void print() {
        System.out.println("Implementing print() method from interface A");
    }
}
