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

        i=3;
        switch (i) {
            case 1 :
                System.err.println("Monday");
                break;
            case 2 :
                System.err.println("Tuesday");    
                break;
                case 3 :
                System.err.println("Wed");
                break;
            case 4 :
                System.err.println("Thur");    
                break;
                case 5 :
                System.err.println("Friday");
                break;
            case 6 :
                System.err.println("Sat");    
                break;
            case 7 :
                System.err.println("Sunday");
                break;
        
            default:
                System.err.println("Invalid day");
                break;
        }
    }
}