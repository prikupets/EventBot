package ru.granlovestea.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.granlovestea.model.repository.DataManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);
    private static final String PROPERTIES_PATH = "config.properties";
    public static Properties PROPERTIES;
    public static Bot BOT;
    public static DataManager DATA_MANAGER;

    public static void main(String[] args) {
        try {
            readProperties();
            BOT = VKBotFactory.getVKBot();
            BOT.start();
        } catch (IOException e) {
            LOG.error("Can't read properties because of exception {}", e.getMessage());
        }
    }

    private static void readProperties() throws IOException {
        InputStream inputStream = Application.class.getClassLoader().getResourceAsStream(PROPERTIES_PATH);
        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + PROPERTIES_PATH + "' not found in the classpath");
        }
        try {
            Properties properties = new Properties();
            properties.load(inputStream);
            PROPERTIES = properties;
        } catch (IOException e) {
            throw new RuntimeException("Incorrect properties file");
        } finally {
            inputStream.close();
        }
    }
}