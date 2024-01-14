package JavaZaawansowana._01_Exceptions;

public class ThirdException extends Exception{
    private int errorCode;

    public ThirdException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
