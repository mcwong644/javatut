public class Demo23 {
    // 07:34:41 Upcasting and Downcasting 
    public static void main(String[] args) {
        double d=4.5;
        //downcast from double to int
        int i = (int)d;
        System.out.println(i);
        A obj = new A();
        obj.show1();
        // upcasting - A obj = new B();
        A obj2 = (A) new B();
        obj2.show1(); // calls A's show1() method

        B obj3 = (B) obj2; // downcasting from A to B
        obj3.show2(); // calls B's show2() method
        
    }

}

class A{
    public void show1(){
        System.out.println("in A show()");
    }
}
class B extends A {
    public void show2(){
        System.out.println("in A show()");
    }
}