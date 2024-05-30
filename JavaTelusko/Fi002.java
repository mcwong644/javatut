import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fi002 {
    // https://youtu.be/C_vOMUDWV-8?si=d6TDNQ-kZckOa2pm
    public static void main(String[] args) {
        String filePath = "C:\\xampp\\htdocs\\javatut\\JavaTelusko\\testfolder2\\testfile.txt";
        String newfilePath = "C:\\xampp\\htdocs\\javatut\\JavaTelusko\\testfolder2\\testfile2.txt";
        createFile(filePath);
        writeFile(filePath);
        readFile(filePath);
        renameFile(filePath, newfilePath);
        deleteFile(newfilePath);
    }

    public static void createFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {

                e.printStackTrace();
            }
            System.out.println("File created! " + file.getName()+"\n in "+file.getPath());
        } else {
            System.out.println("File not created already exists! " + file.getName());
        }
    }

    public static void writeFile(String filePath) {
        File file = new File(filePath);
        try (// write to file, use append mode to write to file
                FileWriter fileWriter = new FileWriter(filePath, true);) {
            fileWriter.write("Hello World written to file....\n");
            System.out.println("Wrtten text to file " + file.getName());
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void readFile(String filePath) {
        File myObj=new File(filePath);
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }

    }
    public static void deleteFile(String filePath)  {
        File file = new File(filePath);
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted! " + file.getName());
        } else {
            System.out.println("File not deleted! " + file.getName());
        }
    }
    public static void renameFile(String oldfilePath, String newfilePath){
        File oldfile = new File(oldfilePath);
        File newfile = new File(newfilePath);
        if(oldfile.exists() &&!newfile.exists()){
            oldfile.renameTo(newfile);
            System.out.println("File renamed! "+oldfile.getName()+" to "+newfile.getName());
        } else{
            System.out.println("Not Renamed - file not exist or new file exist");
        }
    }
}
