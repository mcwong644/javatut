// https://www.geeksforgeeks.org/lambda-expressions-java-8/

public class Test {
    public static void main(String args[]) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);
    
        // remove ()
        FuncInterface fobj2 = x -> System.out.println(x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        fobj2.abstractFun(15);
        fobj.normalFun();
    }
}