package example.lesson8;

public class OwnException extends Exception{

    public OwnException() {
    }

    public OwnException(String message) {
        super(message);
    }

    public OwnException(String message, Throwable cause) {
        super(message, cause);
    }

    public OwnException(Throwable cause) {
        super(cause);
    }

    public OwnException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
