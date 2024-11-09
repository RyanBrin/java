/*
 * Ryan Brinkman
 * Cube Num
 * Page None
 * 10/25/2024
 */

// Import necessary libraries
import java.util.Scanner;

public class CubeNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        scanner.close();

        double cube = cubeNum(num);

        System.out.println(cube);
    }

    public static double cubeNum(int num) {
        return num * num * num;
    }
}