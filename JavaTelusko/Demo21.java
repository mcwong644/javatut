public class Demo21 {
    // 07:16:29 Final keyword 
    public static void main(String[] args) {
        final double PI = 3.14159;  // constant variable
        System.out.println(PI);

        Calc obj=new Calc();
        obj.show();
        obj.add(2, 22);
    }
}
class Calc {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    final public void show(){
        System.out.println("in Calc show()");
    }
}

class ACalc extends Calc {  
    @Override
    public void add(int a, int b) {
        System.out.println("ACalc Sum: " + (a + b));
    }

    // Cannot override final method
    // @Override
    // public void show() {
    //     System.out.println("in ACalc show()");
    // }
}

