public class Demo25 {
    // 07:59:03 Anonymous Inner class 
    public static void main(String[] args) {
        A obj = new A() 
        {
            public void show() {
                System.out.println("In anonymous inner class's show method");
            }
        }; // semi colon needed to close anonymous inner class implementation
        obj.show();
    }
    
}

class A {
    public void show() {
        System.out.println("In class A's show method");
    }
}
