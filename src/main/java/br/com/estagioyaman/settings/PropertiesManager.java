package br.com.estagioyaman.settings;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesManager  {

    static Properties properties = new Properties();

    public static String getPropertiesValue (String key, String applicationOrCredencials) {
        try {
            String pathFile = "src/main/resources/" + applicationOrCredencials + ".properties";
            properties.load(new FileInputStream(pathFile));
        } catch (Exception e){
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static void setPropertiesValue(String key, String value, String applicationOrCredencials){
        properties.setProperty(key, value);
        try {
            String pathFile = "src/main/resources/" + applicationOrCredencials + ".properties";
            properties.store(new FileOutputStream(pathFile), null);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
