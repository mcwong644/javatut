public class Demo33 {
    // Throwing custom exception
    // Catching and handling custom exception
    // Custom exception 
    // Ducking Exception using throws 
    // 09:36:30 Exception throw keyword 
    // 09:42:05 Custom exception 
    // 09:45:35 Ducking Exception using throws 


    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch(MyException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
        finally{
            System.out.println("Executing finally block");
        }

    }
    public static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("WongException: Cannot divide by zero");
        }
        return a / b;
    }   
}

class MyException extends Exception {   
    public MyException(String message) {
        super(message);
    }
}
