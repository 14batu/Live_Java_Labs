package week10_morning;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCard {
    private List<Product> productList;

    public ShoppingCard(){
        productList =  new ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void displayCard(){
        if (productList.isEmpty()){
            System.out.println("No product");
        }else {
            System.out.println("Products are in the card: ");
            for (Product each : productList) {
                System.out.println(each);
            }
        }
    }
    public void removeProduct(Product product){
        if (!productList.contains(product)){
            throw new ProductNotFoundException("Not found");
        }else {
            productList.remove(product);
        }
    }

}
