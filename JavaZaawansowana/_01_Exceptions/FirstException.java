package JavaZaawansowana._01_Exceptions;

public class FirstException extends Exception {
    private int errorCode;
    public FirstException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
