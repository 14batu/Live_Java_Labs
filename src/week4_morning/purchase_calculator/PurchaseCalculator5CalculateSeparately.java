package Week4.morning.purchase_calculator;

public class PurchaseCalculator5CalculateSeparately {

    public static void main(String[] args) {

        //Declare and assign a value to a variable in a single line
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;
        double salesTaxRate = 0.08;

        // Calculate separately  total cost, sales tax, and grand total
        double totalCostBeforeTax=unitPrice*quantity;
        double salesTax=totalCostBeforeTax*salesTaxRate;
        double grandTotal=totalCostBeforeTax+salesTax;

        // Print the results
        System.out.println("Item name: " + itemName);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Quantity: " + quantity+"\n");
        System.out.println("Total cost before tax: $" + totalCostBeforeTax);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("=============================");
        System.out.println("Grand Total: $" + grandTotal);

            }
                /*1. Create a class named PurchaseCalculator.

 	1.1 Given the following variables:
           - salesTaxRate (double)
           - itemName (String)
           - unitPrice (double)
           - quantity (int)

    1.2 The program should calculate the total cost before tax, the sales tax, and the grand total.

    1.3 The program should display them on the console in the following format:

         Example:
	           itemName = "Fuji Apple"
	           unitPrice = 1.5
	           quantity = 5
	           salesTaxRate = 8

         Output:
	           Item name: Fuji Apple
	           Unit price: $1.5
	           Quantity: 5

	           Total cost before tax: $7.5
	           Sales tax: $0.6
	           ==========================
	           Grand Total: $8.1
*/

}

