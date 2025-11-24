package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    private static Properties properties;

    private PropertyLoader() {
    }

    public static Properties getProperties() {
        if (properties == null) {
            properties = loadProperties();
            return properties;
        }
        return properties;
    }

    public static Properties loadProperties() {

        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }


}
