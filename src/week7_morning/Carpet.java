package week7_morning;

public class Carpet {
    public int width;
    public int length;
    public double unitPrice;

    public boolean isPersian;



    public double calcCost(){
        return (width * length * unitPrice) + (isPersian ? 200 : 0);

    }
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                "\nTotal Cost= $" + calcCost() +
                '}';
    }



}
/*
1. Create a custom class named Carpet with the following specifications:

    Attributes:
        width
        length
        unitPrice
        isPersian

    Actions:
        calcCost(): Calculates and returns the total price of the carpet.

        toString(): Returns a string representation of the carpet object with full information, including the total cost calculated by calcCost().

    The formula to calculate the price of the carpet is as follows:
        Total price of carpet = (width * length) * unitPrice
        If the carpet is a Persian carpet, add $200 to the totalPrice.

   Create another class named CarpetClients, create multiple carpet objects, and test the function of each carpet object.
 */
