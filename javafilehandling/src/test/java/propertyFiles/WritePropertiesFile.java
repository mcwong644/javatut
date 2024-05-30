package propertyFiles;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFiles {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("name", "Jeff");
        properties.setProperty("email", "abc@gmail.com");
        properties.setProperty("age", "25");

        String filePath = System.getProperty("user.dir") + "/data/example.properties"; 
        FileOutputStream file = new FileOutputStream(filePath);
        properties.store(file, "Sample data in properties file....");
        file.close();
        System.out.println("Properties have been written into "+filePath);
        
    }

}
