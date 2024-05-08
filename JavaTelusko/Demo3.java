public class Demo3 {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        int num1=10;
        int num2=20;
        int r = calc.add(num1, num2);
        System.out.println(r);       
    }
}
// cannot declare as public since it's inside another class
class Calculator {
    public int add(int n1, int n2){
        return n1 + n2;        
    }

    
}
