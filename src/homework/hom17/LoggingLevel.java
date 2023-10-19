package homework.hom17;

public enum LoggingLevel {
    INFO,
    DEBUG;

    public boolean canLog(LoggingLevel level) {
        // This method determines whether the message can be logged at this level
        return this.ordinal() >= level.ordinal();
    }
}