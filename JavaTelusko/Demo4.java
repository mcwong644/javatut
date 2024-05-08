public class Demo4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r = calc.add(10, 15);
        System.out.println("Addition Integer: " + r);
        // use printf for formatted output integer- width=20 
        System.out.printf("Integer Result r = %20d\n",r); 

        double n1=22;
        double n2=33;
        double r2 = calc.add(n1, n2);
        System.out.println("Addition Double: " + r2);
        // use printf for formatted output double
        System.out.printf("Result r2 = %10.3f\n",r2); 
    }
}

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    // method overload to handle double addition
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }
    // method overload to handle double subtraction
    public double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public int divide(int n1, int n2) {
        return n1 / n2;
    }
}
