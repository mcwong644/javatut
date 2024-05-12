public class Demo26 {
    // 08:04:11 abstract and anonymous inner class 
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        // using inner anonymous class
        A obj2 = new A() 
        {
            public void show() {
                System.out.println("Overriding abstract show() method in anonymous inner class");
            }
        }; // semi colon needed to close anonymous inner class implementation
        obj2.show();
    }
}

abstract class A {
    // declare abstract method show()
    public abstract void show();
}

class B extends A {
    
    public void show() {
        System.out.println("Implementing abstract show() method in class B");
    }
}
