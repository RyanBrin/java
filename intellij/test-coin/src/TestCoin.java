/*
 * Project: Test Coin
 * Author: Ryan Brinkman
 * Date: 11/12/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/test-coin/
 */


public class TestCoin
{
    public static void main(String[] args)
    {
        Coin penny = new Coin();
        Coin nickel = new Coin();
        Coin dime = new Coin();
        Coin quarter = new Coin();
        Coin halfDollar = new Coin();
        Coin dollar = new Coin();

        penny.flip();
        nickel.flip();
        dime.flip();
        quarter.flip();
        halfDollar.flip();
        dollar.flip();

        System.out.println("Penny: " + penny.getFaceUp());
        System.out.println("Nickel: " + nickel.getFaceUp());
        System.out.println("Dime: " + dime.getFaceUp());
        System.out.println("Quarter: " + quarter.getFaceUp());
        System.out.println("Half Dollar: " + halfDollar.getFaceUp());
        System.out.println("Dollar: " + dollar.getFaceUp());
    }
}
