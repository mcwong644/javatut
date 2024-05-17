public class Demo32 {
    // Exceptions
    // 09:15:57 Exception Handling using try catch 
    // 09:21:58 try with multiple catch 
    // 09:32:14 Exception Hierarchy 
    // 09:36:30 Exception throw keyword 
    // 09:42:05 Custom exception 
    // 09:45:35 Ducking Exception using throws 
    
    public static void main(String[] args) {
        int [] ar= new int[]{1,2,3,4,5};
      try {
            // divide by zero exception caught first
            int result = divide(10, 0);
            System.out.println("Result: " + result);
            System.out.println(ar[5]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }
        // Add a finally block to ensure cleanup
        finally {
            System.out.println("Executing finally block");
        }
    }
    // method defined in main class to throw custom exception
    public static int divide(int a, int b) {
        return a / b;
    }
}

