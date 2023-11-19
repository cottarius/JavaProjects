package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class DataFileOperation {
    String filePath = "1.txt";
    public void readFromFile(Map<String, String> map){
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":", 2);
                if (parts.length >= 2) {
                    String key = parts[0];
                    String value = parts[1];
                    map.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
