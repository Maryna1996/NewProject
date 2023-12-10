package example.lesson19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import static example.lesson19.Configuration.CONFIG;

public class GateService {


    public GateService() {
        Configuration configuration = new Configuration();
        configuration.readProperties("properties.txt");
    }

    public void open() {
        //logic
        logging(LocalDateTime.now() + " Gate was opened");
    }


    public void close() {
        //logic
        String message;
        final LocalDateTime time = LocalDateTime.now();
        final String s = time.toString();
        final String substring = s.substring(s.length() - 1);
        final int i = Integer.parseInt(substring);
        message = "INFO: " + time + " Gate was closed";
        if (i == 5) {
            message = "ERROR: " + time + " Gate couldn't be closed";
        }
        logging(message);
    }

    private void logging(String message) {
        final String isLogToFile = CONFIG.get("IsLogToFile");

        final boolean flag = Boolean.parseBoolean(isLogToFile);
        if (flag) {
            try (PrintWriter w = new PrintWriter(new FileWriter("logFile.txt", true))) {
                w.println(message);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //
        } else {
            System.out.println(message);
        }
    }
}