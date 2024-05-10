public class Demo19 {
    // 06:36:16 Method Overriding 
    public static void main(String[] args) {
        B b = new B();
        b.show();

    }
}

class A {
    public void show() {
        System.out.println("in A show()");
    }
}

    class B extends A {
        public void show() {
            System.out.println("in B show()");
        }
    }

