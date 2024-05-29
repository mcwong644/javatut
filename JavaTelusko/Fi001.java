import java.io.File;

public class Fi001 {
    public static void main(String[] args) {
        // createFolder("C:\\Users\\<NAME>\\Desktop\\test");
        createFolder("C:\\xampp\\htdocs\\javatut\\javatelusko\\testfolder");
    }

    public static void createFolder(String folderpath) {
        File folder = new File(folderpath);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder created! "+folderpath);
        }

        
    }
}
