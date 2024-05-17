import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo35 {
    // 09:55:29 User Input using BufferedReader and Scanner 
    public static void main(String[] args) throws IOException {
        // System.out.print("Enter 1 digit number: ");
        // int num=System.in.read(); // read ascii char. only 1 char
        // System.out.println("You entered: " + (num - 48)); // minus 48 to get the number
        
        // must comment out above else ERROR!! 
        // System.out.print("Enter 2nd number: ");
        // InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(isr);
        // int num2 = Integer.parseInt(br.readLine());
        // System.out.println("You entered 2nd number : " + num2);
        // br.close();
        // isr.close();

        // must comment out above else ERROR!! 
        System.out.print("Enter 3rd number: ");
        Scanner sc= new Scanner(System.in);
        int num3=sc.nextInt();
        System.out.println("You entered 3rd number: " + num3);
        sc.close();

    }
}
