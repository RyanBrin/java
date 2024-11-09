/*
 * Ryan Brinkman
 * Hailstone V2.0
 * Page 154
 * 10/10/2024
 */

public class HailstoneV2 {
    public static void main(String[] args) {

        // Declare variables
        int num;
        String sequence;

        // Header
        System.out.printf("%-8s %-8s %-8s %n", "Num", "Steps", "Sequence");

        // Calculate hailstone sequence
        for (int i = 1; i <= 200; i++) {
            num = i;
            sequence = i + " ";
            int steps = 0;

            while (num != 1) {
                steps++;

                if (num % 2 == 0)
                    num /= 2;
                else
                    num = 3 * num + 1;

                sequence += num + " ";

            }

            // Display the result
            System.out.printf("%-8d %-8d %-8s %n", i, steps, sequence.trim());
        }
    }
}
