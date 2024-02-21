package week10_morning;

public class InvalidProductNameException extends RuntimeException{
    public InvalidProductNameException() {
        super("Product name cannot be empty or null");
    }

    public InvalidProductNameException(String message) {
        super(message);
    }
}
