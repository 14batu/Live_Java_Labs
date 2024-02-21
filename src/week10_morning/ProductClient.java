package week10_morning;

public class ProductClient {
    public static void main(String[] args) {
        ShoppingCard shoppingCard = new ShoppingCard();
        Product product = new Product("Nike",160.0);

        shoppingCard.addProduct(product);
        shoppingCard.displayCard();

        try {
            shoppingCard.removeProduct(product);
        }catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
