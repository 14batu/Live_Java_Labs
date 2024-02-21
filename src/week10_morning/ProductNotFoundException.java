package week10_morning;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super("The Product does not exist");
    }

    public ProductNotFoundException(String message) {
        super(message);
    }
}
