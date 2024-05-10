import tools.*;

public class Demo17 {
    
// 06:10:51 Need of Inheritance 
// 06:17:06 What is Inheritance 
// 06:25:50 Single and Multilevel inheritance 
// 06:29:41 Multiple Inheritance 

// use BasicCalc class from BasicCalc.java
// use AdvCalc class from AdvCalc.java
    public static void main(String[] args) {
        BasicCalc calc = new BasicCalc();
        int r1=calc.add(10,33);
        System.out.println("Add : \t\t"+ r1);
        int r2=calc.subtract(30,11);
        System.out.println("Subtract : \t" + r2);

        AdvCalc advCalc = new AdvCalc();
        int r3 = advCalc.multiply(5, 6);
        System.out.println("AdvCalc multiply : " + r3);
    }
}


