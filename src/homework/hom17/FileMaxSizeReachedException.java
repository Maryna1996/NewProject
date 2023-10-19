package homework.hom17;

public class FileMaxSizeReachedException extends Exception {
    private final long maxFileSize;
    private final long currentLogSize;
    private final String logFilePath;

    public FileMaxSizeReachedException(long maxFileSize, long currentLogSize, String logFilePath) {
        this.maxFileSize = maxFileSize;
        this.currentLogSize = currentLogSize;
        this.logFilePath = logFilePath;
    }

    @Override
    public String getMessage() {
        return "File size limit reached. Max File Size: " + maxFileSize +
                ", Current File Size: " + currentLogSize +
                ", File Path: " + logFilePath;
    }
}
