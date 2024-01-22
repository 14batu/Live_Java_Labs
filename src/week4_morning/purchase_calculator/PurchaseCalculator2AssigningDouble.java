package week4_morning.purchase_calculator;

public class PurchaseCalculator2AssigningDouble {

    public static void main(String[] args) {

       // Variable declarations
        String itemName;
        double unitPrice;
        int quantity;
        double salesTaxRate;

        // Variable assignments
        itemName="Fuji Apple";
        unitPrice=1.5;
        quantity=5;
        salesTaxRate=0.08;

        //Assigning a value to double variable
        //salesTaxRate=8/100;
        //An integer is a number that can be written without a fractional component. The expression 8/100 represents a fraction and is equal to 0.08. It is a rational number, specifically a decimal fraction. In this case, the numerator is 8, and the denominator is 100, indicating 8 parts out of 100.But it behaves like int.The issue is related to integer division. In Java, if you perform division with two integers, the result will also be an integer. In this case, 8 and 100 are both integers, so the division 8 / 100 will result in integer division, which discards the fractional part and evaluates to 0. Using this integer division, result will be implicitly converted to double. Output: 0.0 (because 8 divided by 100 is 0 with integer division)

        //Solution for this issue:

        //1.
        //salesTaxRate1=8.0/100;
        //Using one of the operands as double literals to force the division to be in double
        // Output: 0.08

        //2.
        //salesTaxRate=(double)8/100;
        // Casting one of the operands to double to force the division to be in double
        // Output: 0.08

        //3.
        //salesTaxRate=8/100D;
        // Adding "D" at the end of an integer literal denotes that the number should be treated as a double
        // Output: 0.08

        //4.
        //salesTaxRate=0.08;
        //The decimal number 0.08 is a real number, specifically a rational number.
        // Output: 0.08

        //In summary, when dealing with division in Java and you want a result with decimal places, make sure at least one of the operands is of type double or float



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

