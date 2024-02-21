package week10_morning;

public class InvalidProductPriceException extends ProductException{
    public InvalidProductPriceException() {
    }

    public InvalidProductPriceException(String message) {
        super(message);
    }
}
