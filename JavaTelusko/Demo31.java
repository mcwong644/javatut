public class Demo31 {
    // 08:53:14 Functional Interface 
    // 08:56:43 Lambda Expression 
    // 09:02:51 Lambda Expression with return 

    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        // alternate way to create object of functional interface
        // anonymous class
        A obj3 = new A() 
        {
            public void show() {
                System.out.println("Anonymous class implementation of A's show method");
            }
        };
        obj3.show();
        // lambda expression
        A obj2 = () -> System.out.println("B's show method using lambda expression");
        obj2.show();
        // lambda with arguments
        A2 obj4 = (x, y) -> x + y;
        System.out.println("Sum using lambda: " + obj4.add(5, 10));
        
    }

}

// single abstract method interface. only 1 method can be defined
@FunctionalInterface
interface A{
    void show();
}

class B implements A {
    public void show() {
        System.out.println("B's show method");
    }
}   

// functional interface with arguments
@FunctionalInterface
interface A2{
    int add(int x,int y);
    
}

class B2 implements A2 {
    public int add(int x, int y) {
        return x + y;
    }
}   