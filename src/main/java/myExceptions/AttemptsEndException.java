package myExceptions;

public class AttemptsEndException extends Exception {

    public AttemptsEndException(String message) {
        super(message);
    }


    public AttemptsEndException() {
        super("Attempts have been exhausted. Bye.");
    }
}
