package exceptions;

public class NoParkingSpotsAvailableException extends RuntimeException{
    public NoParkingSpotsAvailableException() {
        super("No parking spots left in this parking lot.");
    }
}