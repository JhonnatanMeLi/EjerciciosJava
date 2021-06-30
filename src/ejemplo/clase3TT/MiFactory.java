package ejemplo.clase3TT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) {
        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("MiFactory.properties")));
            return Class.forName(properties.getProperty(objName)).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}
