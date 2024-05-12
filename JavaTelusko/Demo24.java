public class Demo24 {
    // 07:53:26 Inner class
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
     
        // create instance of inner class B
        A.B obj1 = obj.new B();
        obj1.show(); // calls inner class B's show() method
        obj1.config();
    }
}

class A{
    int age;
    public void show(){
        System.out.println("Inside class A");

    }
    class B {
        public void show() {
            System.out.println("Inside class B");
        }
        public void config(){
            System.out.println("in config method of inner class B");
        }
    }

}
