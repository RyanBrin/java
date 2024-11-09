/*
Ryan Brinkman
Formatting
Page None
8/28/2024
*/

import java.text.NumberFormat;

public class formatting
{
    public static void main(String[] args)
    {

        double dollars = 21.5;
        int num = 1234;
        double numWithDecimal = 2.0/3.0;
        double salePercent = .15;c

        // format statements
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat commas = NumberFormat.getCurrencyInstance();
        NumberFormat decimals = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getCurrencyInstance();

        // display
        System.out.println("Dollars: " + money.format(dollars));
        System.out.println("Number: " + commas.format(num));
        System.out.println("Decimal: " + decimals.format(numWithDecimal));
        System.out.println("Sale Percent: " + percent.format(salePercent));

        // calculate and display
        double total = dollars + numWithDecimal;
        System.out.println("Total: " + money.format(total));
        double discount = total * salePercent;
        System.out.println("Discount: " + money.format(discount));
        double finalPrice = total - discount;
        System.out.println("Final Price: " + money.format(finalPrice));

    }
}