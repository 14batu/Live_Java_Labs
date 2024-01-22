package week4_morning.purchase_calculator;

public class PurchaseCalculator4CalculateWhilePrinting {

    public static void main(String[] args) {

        //Declare and assign a value to a variable in a single line
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;
        double salesTaxRate = 0.08;

        // Calculate while printing the results(It is not a good practice.)
        System.out.println("Item name: " + itemName);
        System.out.println("Unit price: $" + unitPrice);
        System.out.println("Quantity: " + quantity+"\n");
        System.out.println("Total cost before tax: $" + unitPrice*quantity);
        System.out.println("Sales tax: $" + unitPrice*quantity*salesTaxRate);//sales tax s applied to the total cost
        System.out.println("=============================");
        System.out.println("Grand Total: $" + (unitPrice*quantity + unitPrice*quantity*salesTaxRate));


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

