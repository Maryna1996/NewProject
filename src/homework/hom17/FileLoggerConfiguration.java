package homework.hom17;

public class FileLoggerConfiguration {
    private String logFile;
    private LoggingLevel logLevel;
    private long maxFileSize;
    private String logFormat;

    public FileLoggerConfiguration(String logFile, LoggingLevel logLevel, long maxFileSize, String logFormat) {
        this.logFile = logFile;
        this.logLevel = logLevel;
        this.maxFileSize = maxFileSize;
        this.logFormat = logFormat;
    }

    public String getLogFile() {
        return logFile;
    }

    public void setLogFile(String logFile) {
        this.logFile = logFile;
    }

    public LoggingLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LoggingLevel logLevel) {
        this.logLevel = logLevel;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(long maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }
}

