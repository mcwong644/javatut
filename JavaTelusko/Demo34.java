public class Demo34 {
    // 09:45:35 Ducking Exception using throws     
    public static void main(String[] args) {
        try {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
            // e.printStackTrace();
        }         
        } finally {
            System.out.println("Executing finally block");
            
        }
    }

    class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }   
}

class A {
    public void show() throws ClassNotFoundException{
        
            Class.forName("DemoCalc");

        
    }
}