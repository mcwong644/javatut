public class Hello3 {
    // operators +, -, *, /
    public static void main(String[] args) {
      int num1=7;
      int num2=5;
      int result=num1 + num2;
      System.out.println("+ : " + result);  

      result=num1-num2;
      System.out.println("- : " + result);  
      result=num1* num2;
      System.out.println("* : " + result);  
      result=num1/num2;
      System.out.println("/ : " + result);  
      result=num1%num2;
      System.out.println("% : " + result);  

        num1=7;
      result=num1++; //post increment. fetch value then increment
      System.out.println("num1++ : " + result);  
      num1=7;
      result=++num1; //pre increment. increment then fetch value
      System.out.println("++num1 : " + result);  
    }   
}
