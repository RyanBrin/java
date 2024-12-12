/*
 * Project: Lockers
 * Author: Ryan Brinkman
 * Date: 12/12/2024
 * Repository: https://github.com/RyanBrin/java/tree/main/intellij/lockers/
 */

/**
 * The Lockers class simulates the classic locker problem.
 * In this problem, there are 100 lockers in a row, all initially closed.
 * A person walks by the lockers 100 times, each time toggling certain lockers.
 * On the ith pass, the person toggles every ith locker.
 * After 100 passes, some lockers are left open.
 */
public class Lockers {
    /**
     * Simulates the locker problem and displays the results.
     * This method initializes 100 lockers, toggles them based on a specific pattern,
     * and then prints the status of each locker and the total number of open lockers.
     *
     * The simulation works as follows:
     * 1. Initialize an array to represent 100 lockers.
     * 2. Simulate 100 passes, toggling lockers according to the problem's rules.
     * 3. Print the status of each locker (open or closed).
     * 4. Count and print the total number of open lockers.
     *
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int[] lockers = new int[100];
    
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j += i) {
                lockers[j - 1]++;
            }
        }
    
        System.out.println("Locker Status:");
        System.out.println("----------------");
        for (int i = 0; i < 100; i++) {
            if (lockers[i] % 2 == 1) {
                System.out.printf("Locker %03d: ✅%n", i + 1);
            } else {
                System.out.printf("Locker %03d: ❌%n", i + 1);
            }
        }
    
        int openLockers = 0;
    
        for (int locker : lockers) {
            if (locker % 2 == 1) {
                openLockers++;
            }
        }
    
        System.out.println("\nNumber of open lockers: " + openLockers);
    }
}
