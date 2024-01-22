package week4_morning.mortgage_calculator;

import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator5_CurrencyFormat {
    /*2. Create a Java class named MortgageCalculator with the following requirements:

    2.1 Define the following variables:

	        loanAmount: Represents the loan amount.
	        loanTermInYears: Represents the loan term in years.
	        loanType: Represents the type of loan.

    2.2 Determine the annual interest rates for different loan types:

            Fixed(Fixed-Rate Payment):
                30 years: 7.5%
                15 years: 6.9%

            FHA(Federal Housing Administration):
                30 years: 7.24%
                15 years: 6.62%

            VA(Veterans Affairs):
                30 years: 6.75%
                15 years: 5.99%

    2.3 Write a program to calculate the monthly mortgage payment using the following formula:

        monthlyInterestRate = annualInterestRate / 100 / 12
        numberOfPayments = loanTermInYears * 12
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))


    2.4 Display the output in the following format:

            Example 1:
                loanAmount = $500,000
                loanTermInYears = 30
                loanType = "Fixed"

            Output:
                Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


    Ensure that the program accurately calculates the monthly mortgage payment based on the
    specified loan amount, term, and type.*/
    public static void main(String[] args) {

        //Define the following variables:
        int loanAmount=500000;
        int loanTermInYears=30; //30 or 15
        String loanType="Fixed"; //Fixed or FHA or VA

        //Determine the annual interest rates for different loan types:
        double annualInterestRate=0.0;

            //merged the same type of loan with nested if
    if(loanType=="Fixed"){
        if(loanTermInYears==30) annualInterestRate=7.5;
        if(loanTermInYears==15) annualInterestRate=6.9;
    }else if(loanType=="FHA"){
        if(loanTermInYears==30) annualInterestRate=7.24;
        if(loanTermInYears==15) annualInterestRate=6.62;
    }else if(loanType=="VA"){
        if(loanTermInYears==30) annualInterestRate=6.75;
        if(loanTermInYears==15) annualInterestRate=5.99;
        }

        //Write a program to calculate the monthly mortgage payment using the following formula:

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = ((loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments)));

        //Display the output in the following format:

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);

        // Format the number as currency
        String monthlyPaymentInFormat = currencyFormat.format(monthlyPayment);



        System.out.println("Your monthly mortgage payment for a "+loanTermInYears+" Yr. "+loanType+" loan is: "+monthlyPaymentInFormat);

    }

    }
