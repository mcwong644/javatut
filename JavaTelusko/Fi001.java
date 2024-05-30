import java.io.File;
// https://youtu.be/aU4kYFkC3r0?si=ovEpwOn_gYnG5zKM
// Handling Text Files in Java | Folder Operations | Part 1 | Hands-on
public class Fi001 {
    public static void main(String[] args) {
        String path = "C:\\xampp\\htdocs\\javatut\\javatelusko\\testfolder";
        String newPath="C:\\xampp\\htdocs\\javatut\\javatelusko\\testfolder2";
        // createFolder("C:\\Users\\<NAME>\\Desktop\\test");
        createFolder(path);
        if (checkFolderExists(path)){
            System.out.println("Folder exists! "+ path);
        }
        renameFolder(path, newPath);
        deleteFolder(path);

    }

    public static void createFolder(String folderpath) {
        File folder = new File(folderpath);
        if (!folder.exists()) {
            folder.mkdir();
            System.out.println("Folder created! "+folderpath);
        } else {
            System.out.println("Folder not created already exists! "+folderpath);
        }   

        
    }
    // check if folder exists
    public static boolean checkFolderExists(String folderpath) {
        File folder = new File(folderpath);
        return folder.exists();

        
    }

    public static void renameFolder(String folderpath, String newfolderpath) {
        File folder = new File(folderpath);
        File newfolder = new File(newfolderpath);
        if (folder.exists() && !newfolder.exists()){
            folder.renameTo(newfolder);
            System.out.println("Folder renamed! "+folderpath+" to "+newfolderpath);
        } else{
            System.out.println("Not Renamed - folder not exist or new folder exist");
        }
        
    }

    public static void deleteFolder(String folderpath) {    
        File folder = new File(folderpath);
        if (folder.exists()) {
            File[] files = folder.listFiles(); // get all the file names
            for (File file : files) {
                file.delete();                  // delete each file
            }
            folder.delete();
            System.out.println("Folder deleted! "+folderpath);
        } else {
            System.out.println("Folder not deleted! "+folderpath);
        }
    }


}
