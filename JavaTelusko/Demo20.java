public class Demo20 {
    // 07:08:31 Dynamic Method Dispatch 
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj= new B();
        obj.show();

        obj= new C();
        obj.show();
    }
}
class A {
    public void show() {
        System.out.println("In class A's show() method");
    }
}
class B extends A {
    @Override
    public void show() {
        System.out.println("In class B's show() method");
    }
}

class C extends A {
    @Override
    public void show() {
        System.out.println("In class C's show() method");
    }
}
