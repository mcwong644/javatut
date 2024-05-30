package propertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException  {
        Properties properties = new Properties();
        String filePath=System.getProperty("user.dir")+"/data/example.properties";

        FileInputStream file = new FileInputStream(filePath);
        properties.load(file);

        file.close();
        // read data from properties file
        System.out.println("Name: "+properties.getProperty("name"));
        System.out.println("Email: "+properties.getProperty("email"));
        System.out.println("Age: "+properties.getProperty("age"));
        
        //capture all the properties
        Set<String> keys = properties.stringPropertyNames();
        System.out.println(keys);
    }
} 
