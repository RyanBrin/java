/*
 * Ryan Brinkman
 * Pythagorean Triple
 * Page 176
 * 10/30/2024
 */

public class PythagoreanTriple {

    public static int count = 0;

    public static void main(String[] args) {

        System.out.println("Perfect Squares within 1000:");

        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                double num = perfectSquare(i, j);
                if (num > 0) {
                    System.out.println(i + "² + " + j + "² = " + (int) num);
                }
            }
        }

        System.out.println("\nNumber of perfect squares: " + count);
    }

    public static double perfectSquare(int a, int b) {
        double c = Math.sqrt(a * a + b * b);

        if (c == (int) c) {

            count++;

            return c;
        }
        return -1;
    }
}