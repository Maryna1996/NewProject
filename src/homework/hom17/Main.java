package homework.hom17;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileMaxSizeReachedException, IOException {
        try (FileLogger logger = new FileLogger(new FileLoggerConfiguration(
                "log.txt",
                LoggingLevel.DEBUG,
                1024,
                "[TIME][LEVEL] Message: [MESSAGE]"
        ))) {
            logger.info("This is an info message.");
            logger.debug("This is a debug message.");
        } catch (IOException | FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }
}


