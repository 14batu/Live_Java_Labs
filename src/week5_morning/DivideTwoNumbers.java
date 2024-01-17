package week5_morning;

public class DivideTwoNumbers {
    public static void main(String[] args) {


        int dividend = 100;
        int divisor = 6;
        int quotient = 0;


        for (int i = 0; dividend >= divisor; i++) {
            dividend-=divisor;
            quotient++;

        }
         int remainder = dividend;


        //System.out.println("quotient = " + quotient);
        //System.out.println(i);

        System.out.println(quotient + " with a remainder of " + remainder);

    }
}
