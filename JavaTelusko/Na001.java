// https://youtu.be/B4WmfcjQ9QA?si=gOI3SEpUERZkawyz
// Part 1 : File Handling : Copy File in Java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Na001 {
    public static void main(String[] args) {
        String file = "C:\\StamfordDrivei5\\May 2024\\zLHDN BE2023_560406075551.pdf";
        String opFile = "c:\\xampp\\htdocs\\javatut\\javatelusko\\sample.pdf";
        copyFile(file, opFile);
        
    }

    public static void copyFile(String a, String b) {    
        File file = new File(a);
        File opFile = new File(b);
        
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(opFile);
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(fileInputStream.available()); 
            // * Returns an estimate of the number of remaining bytes that can be read (or
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
        int i=0;
        try {
            while((i=fileInputStream.read()) !=-1) {
                fileOutputStream.write(i);
            }
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {

                e.printStackTrace();
            }
        }   
     
    }
}
