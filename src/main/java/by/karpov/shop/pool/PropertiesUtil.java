package by.karpov.shop.pool;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }

    private PropertiesUtil() {
    }

    public static String getProperty(String key) {
        String property = PROPERTIES.getProperty(key);
        return property;
    }

    private static void loadProperties() {
        try (InputStream inputStream = PropertiesUtil.class
                .getClassLoader()
                .getResourceAsStream("application.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}