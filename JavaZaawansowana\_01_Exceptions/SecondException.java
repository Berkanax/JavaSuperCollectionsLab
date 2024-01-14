package JavaZaawansowana._01_Exceptions;

public class SecondException extends Exception{
    private int errorCode;
    public SecondException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
