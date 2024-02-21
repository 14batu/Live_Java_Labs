package week10_morning;

public class ProductException extends RuntimeException{
    public ProductException() {
        super("Invalid Product");
    }

    public ProductException(String message) {
        super(message);
    }


}
