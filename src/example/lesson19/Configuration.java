package example.lesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Configuration {

    public static final Map<String, String> CONFIG = new HashMap<>();

    public void readProperties(String fileName) {
        try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = r.readLine()) != null) {
                final String[] properties = line.split("=");
                CONFIG.put(properties[0], properties[1]);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}