/*
 * Project: Highest Grade
 * Author: Ryan Brinkman
 * Date: February 20, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/highest-grade/
 */

import java.util.Scanner;
import java.util.ArrayList;

public class HighestGrade {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);

        int grade;
        int highestGrade = 0;

        do {
            System.out.println("Enter your grades (0-100, -1 to stop):");
            grade = scanner.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a valid grade between 0 and 100.");
            } else if (grade != -1) {
                System.out.println("Valid grade entered.");
                grades.add(grade);
            }
            

        } while (grade != -1);

        scanner.close();

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > highestGrade) {
                highestGrade = grades.get(i);
            }
        }
    }
}