package standard.exceptions;

public class InvalidArgumentException extends RuntimeException {
    public InvalidArgumentException(String message) {
        super(message);
    }
    public InvalidArgumentException(){super();}
}
