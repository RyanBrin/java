/**
 * Project: Equivalent Fractions
 * Author: Ryan Brinkman
 * Date: 1/14/2025
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/equivalent-fractions/
 */

import java.util.Scanner;

public class EquivalentFractions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the difficulty (beginner or advanced): ");
        String difficulty = scanner.nextLine().toLowerCase();

        switch (difficulty) {
            case "beginner" -> playerBeginnerGame(scanner);
            case "advanced" -> playerAdvancedGame(scanner);
            default -> System.out.println("Invalid difficulty level. Please try again.");
        }

        scanner.close();
    }

    public static void playerBeginnerGame(Scanner scanner) {
        System.out.println("Equivalent Fractions Quiz (Beginner Mode)");
        System.out.println("""
                1. 21/3
                2. 2/3
                3. 4/3
                4. 28/4
                5. 8/12
                6. 1-1/3
                7. 5/1
                8. 125/5
                """);

        int score = 0;

        System.out.println("What fraction is equivalent to #1? (Enter the number): ");
        int userAnswer = scanner.nextInt();
        if (userAnswer == 4) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is 4.");
        }

        System.out.println("What fraction is equivalent to #2? (Enter the number): ");
        userAnswer = scanner.nextInt();
        if (userAnswer == 5) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is 5.");
        }

        System.out.println("What fraction is equivalent to #3? (Enter the number): ");
        userAnswer = scanner.nextInt();
        if (userAnswer == 6) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is 6.");
        }

        System.out.println("What fraction is equivalent to #7? (Enter the number): ");
        userAnswer = scanner.nextInt();
        if (userAnswer == 8) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is 8.");
        }

        System.out.println("Your score is: " + score + "/4");
    }

    public static void playerAdvancedGame(Scanner scanner) {
        System.out.println("Equivalent Fractions Quiz (Advanced Mode)");
        System.out.println("""
                1. 45/9
                2. 16/24
                3. 81/27
                4. 99/33
                5. 125/25
                6. 144/48
                7. 225/75
                8. 324/108
                9. 400/80
                10. 625/125
                11. 729/243
                12. 1024/256
                13. 1331/121
                14. 1728/432
                15. 2401/343
                """);

        int score = 0;

        int[] correctAnswers = {5, 2, 3, 3, 5, 3, 3, 3, 5, 5, 3, 4, 11, 4, 7};

        for (int i = 0; i < correctAnswers.length; i++) {
            System.out.println("What fraction is equivalent to #" + (i + 1) + "? (Enter the number): ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == correctAnswers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".");
            }
        }

        System.out.println("Your score is: " + score + "/15");
    }
}