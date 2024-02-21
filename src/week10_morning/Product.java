package week10_morning;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name ==null || name.isEmpty()){
            throw new InvalidProductNameException("invalid product name");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            throw new InvalidProductPriceException("invalid price");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
