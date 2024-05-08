public class Demo10 {
    // 04:35:07 What is String 
    public static void main(String[] args) {
     String message = "Hello World";
        System.out.println(message);

        // String Immutable
        message = message.toUpperCase();
        System.out.println(message);

        // String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

     
    }
}