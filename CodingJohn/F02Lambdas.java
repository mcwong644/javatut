public class F02Lambdas {
    public static void main(String[] args) {
        F02Cat myCat = new F02Cat();
        myCat.print("?");
        printThing(myCat);

        // printThing(("s") -> System.out.println("I'm a Lambda cat, Meow!"));
        F02Printable lambdaPrintable=(s) -> System.out.println("I'm a Lambda cat, Meow");
        printThing(lambdaPrintable);
                    
                    
    }

    // method
    static void printThing(F02Printable p) {
        p.print("!");
    }
}

