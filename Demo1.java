public class Demo1 {
    public static void main(String[] args) {
    
        int i=1;
        while(i<=5) {
            System.out.println("Hello World A " + i);
            i++;
        }
        System.out.println("========");
        i=1;
        do {
            System.out.println("Hello World B " + i);
            i++;
        } while(i<=5);
    }
}