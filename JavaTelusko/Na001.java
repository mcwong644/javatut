// https://youtu.be/B4WmfcjQ9QA?si=gOI3SEpUERZkawyz
// Part 1 : File Handling : Copy File in Java

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Na001 {
    public static void main(String[] args) {
        copyFile();
        
    }

    public static void copyFile() {    
        File file = new File("C:\\StamfordDrivei5\\May 2024\\zLHDN BE2023_560406075551.pdf");
        File opFile = new File("c:\\xampp\\htdocs\\javatut\\javatelusko\\sample.pdf");
        
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
