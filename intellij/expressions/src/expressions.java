/*
Ryan Brinkman
Smile
Page None
8/27/2024
*/

public class expressions
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 3;
        int result;

        final double pie = 3.14;

        double doubleNum1 = 5;
        double doubleNum2 = 3;
        double doubleResult;

        // int divided by int
        result = num1/num2;
        System.out.println("num1/num2 = " + result);

        // double divided by double
        doubleResult = doubleNum1/doubleNum2;
        System.out.println("doubleNum1/doubleNum2 = " + doubleResult);

        // int divided by double
        doubleResult = num1/doubleNum2;
        System.out.println("num1/(doubleNum2 = " + doubleResult);

        // int divided by double
        doubleResult = doubleNum1/num2;
        System.out.println("num1/num2 = " + (int)doubleResult);

    }
}