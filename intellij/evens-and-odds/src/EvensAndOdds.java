/*
 * Project: Evens And Odds
 * Author: Ryan Brinkman
 * Date: 12/10/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/evens-and-odds/
 */

public class EvensAndOdds {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        
        System.out.println("EVENS");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        
        System.out.println("\nODDS");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}