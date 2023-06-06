package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
//String path="/Users/marinamonastirschi/IdeaProjects/Test Project/Files/Config.properties";
        String path1 = System.getProperty("user.dir") + "/Files/Config.properties";
        // System.out.println(System.getProperty("user.dir"));
        //  System.out.println(path1);
        // brings the data from the file in the form of bytes
        FileInputStream fis = new FileInputStream(path1);
        // converts the data in the form of key value pairs
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(prop.get("userName"));
        System.out.println(prop.containsKey("userName"));


    }
}
