/**
 * Project: Div and Mod
 * Author: Ryan Brinkman
 * Date: 1/14/2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/div-and-mod/
 */

import java.util.Scanner;

public class DivAndMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter another integer: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println();
        System.out.println(num2 + " / " + num1 + " = " + (num2 / num1));
        System.out.println(num2 + " % " + num1 + " = " + (num2 % num1));
    }
}