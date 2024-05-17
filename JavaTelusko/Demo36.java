import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo36 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i=0;
        // int j=0;
        
        int num=0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // InputStreamReader in = new InputStreamReader(System.in);
            // br = new BufferedReader(new InputStreamReader(System.in));
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
            
        }
        // catch(Exception e) {
        //     System.out.println("Exception occurred: " + e.getMessage());
        // }
        finally {
            // close resources
            System.out.println("Executing finally block");
            // br.close(); no need as try-with-resources will automatically close the BufferedReader
        }

    }
}
