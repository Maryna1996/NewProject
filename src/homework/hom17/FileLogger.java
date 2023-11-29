package homework.hom17;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements AutoCloseable {
    private final FileLoggerConfiguration configuration;
    private long currentLogSize;
    private PrintWriter writer;

    public FileLogger(FileLoggerConfiguration configuration) throws IOException {
        this.configuration = configuration;
        this.currentLogSize = 0;
        createLogFile();
    }

    private void createLogFile() throws IOException {
        File logFile = new File(configuration.getLogFile());
        boolean fileExists = logFile.exists();

        if (fileExists && logFile.length() > configuration.getMaxFileSize()) {
            // Создаем новый файл с учетом даты
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy-HH:mm"));
            File newLogFile = new File("Log_" + timestamp + ".txt");
            writer = new PrintWriter(new BufferedWriter(new FileWriter(newLogFile, true)));
            currentLogSize = newLogFile.length();
        } else {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(logFile, true)));
            currentLogSize = logFile.length();
        }
    }


    public void debug(String message) throws IOException, FileMaxSizeReachedException {
        log(LoggingLevel.DEBUG, message);
    }

    public void info(String message) throws IOException, FileMaxSizeReachedException {
        log(LoggingLevel.INFO, message);
    }

    private void log(LoggingLevel level, String message) throws IOException, FileMaxSizeReachedException {
        if (configuration.getLogLevel().canLog(level)) {
            String logMessage = configuration.getLogFormat()
                    .replace("[TIME]", LocalDateTime.now().toString())
                    .replace("[LEVEL]", level.toString())
                    .replace("[MESSAGE]", message);

            log(logMessage);
        }
    }

    private void log(String logMessage) throws IOException, FileMaxSizeReachedException {
        if (currentLogSize + logMessage.length() > configuration.getMaxFileSize()) {
            throw new FileMaxSizeReachedException(
                    configuration.getMaxFileSize(),
                    currentLogSize,
                    configuration.getLogFile()
            );
        }

        writer.println(logMessage);
        writer.flush();
        currentLogSize += logMessage.length();
    }

    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}

