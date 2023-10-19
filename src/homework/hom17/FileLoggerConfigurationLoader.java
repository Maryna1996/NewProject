package homework.hom17;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load(String configFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(configFile));
        String logFile = null;
        LoggingLevel logLevel = null;
        long maxFileSize = 0;
        String logFormat = null;

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith("FILE: ")) {
                logFile = line.substring("FILE: ".length());
            } else if (line.startsWith("LEVEL: ")) {
                logLevel = LoggingLevel.valueOf(line.substring("LEVEL: ".length()));
            } else if (line.startsWith("MAX-SIZE: ")) {
                maxFileSize = Long.parseLong(line.substring("MAX-SIZE: ".length()));
            } else if (line.startsWith("FORMAT: ")) {
                logFormat = line.substring("FORMAT: ".length());
            }
        }

        return new FileLoggerConfiguration(logFile, logLevel, maxFileSize, logFormat);
    }
}
