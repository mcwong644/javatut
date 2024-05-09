public class Demo15 {
    // 
    // 05:49:36 this and super method 
    
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

class A{

    private int x;
    private int y;

    public A() {
        System.out.println("A's constructor called.");
    }
    public A(int x) {
        this.x = x;
        
        System.out.println("A's parameterized constructor called.");
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class B extends A {
    // private int x;
    // private int y;

    public B() {
        super(); // Call constructor of parent class A
        System.out.println("B's constructor called.");
    }
    public B(int n){
        // can call either super() or super(n) but not both
        super(); // Call constructor of parent class A
        // super(n); // Call parameterized constructor of parent class A
        System.out.println("B's parameterized constructor called.");
    }
}
