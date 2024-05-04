public class Demo2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Hi " + i);
        }

        int j = 3;

        switch (j) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
