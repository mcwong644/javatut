import java.util.Stack;
// #2 (00:02:20) Stacks

public class Ds001 {
    
    public static void main(String[] args) {
     // stack

     
     Stack<String> stack = new Stack<String>();
     stack.push("MineCraft");
     stack.push("Skyrim");
     stack.push("DOOM");
     stack.push("Borderlands");
     stack.push("FFVII");

     System.out.println(stack.empty()); // false
     System.out.println(stack.peek()); // "FFVII"
     System.out.println(stack);
     String s1=stack.pop();
     System.out.println(stack);
     System.out.println(s1);
     System.out.println("===== Loop and pop =========");
     while(stack.empty()==false){
         System.out.println(stack.pop());
     }
    
    }
}
