/*
 * Project: Towers of Hanoi
 * Author: Ryan Brinkman
 * Date: March 20, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/towers-of-hanoi/
 */

import java.util.Stack;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 4; // You can change this for more or fewer disks
        Stack<Disk> source = new Stack<>();
        Stack<Disk> auxiliary = new Stack<>();
        Stack<Disk> destination = new Stack<>();

        // Initializing source tower with disks
        for (int i = numberOfDisks; i >= 1; i--) {
            source.push(new Disk(i));
        }

        System.out.println("Initial State:");
        printTowers(source, auxiliary, destination);

        // Solve the Towers of Hanoi
        solveTowersOfHanoi(numberOfDisks, source, destination, auxiliary);

        System.out.println("\nFinal State:");
        printTowers(source, auxiliary, destination);
    }

    /**
     * Recursively solves the Towers of Hanoi problem.
     *
     * @param n The number of disks to move.
     * @param source The source tower (stack).
     * @param destination The destination tower (stack).
     * @param auxiliary The auxiliary tower (stack).
     */
    private static void solveTowersOfHanoi(int n, Stack<Disk> source, Stack<Disk> destination, Stack<Disk> auxiliary) {
        if (n == 1) {
            moveDisk(source, destination);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveTowersOfHanoi(n - 1, source, auxiliary, destination);

        // Move the nth disk from source to destination
        moveDisk(source, destination);

        // Move the n-1 disks from auxiliary to destination
        solveTowersOfHanoi(n - 1, auxiliary, destination, source);
    }

    /**
     * Moves the top disk from the source tower to the destination tower.
     *
     * @param source The source tower (stack).
     * @param destination The destination tower (stack).
     */
    private static void moveDisk(Stack<Disk> source, Stack<Disk> destination) {
        Disk disk = source.pop();
        destination.push(disk);
        System.out.println("Moved disk " + disk.getSize() + " from " + getTowerName(source) + " to " + getTowerName(destination));
    }

    /**
     * Identifies the name of the tower (source, auxiliary, or destination).
     *
     * @param tower The stack representing a tower.
     * @return The name of the tower as a string.
     */
    private static String getTowerName(Stack<Disk> tower) {
        // Simple implementation placeholder for better naming (manual handling required here).
        return "Tower";
    }

    /**
     * Prints the current state of all towers.
     *
     * @param source The source tower (stack).
     * @param auxiliary The auxiliary tower (stack).
     * @param destination The destination tower (stack).
     */
    private static void printTowers(Stack<Disk> source, Stack<Disk> auxiliary, Stack<Disk> destination) {
        System.out.println("Source: " + towerToString(source));
        System.out.println("Auxiliary: " + towerToString(auxiliary));
        System.out.println("Destination: " + towerToString(destination));
    }

    /**
     * Converts a tower (stack of disks) into a string representation for printing.
     *
     * @param tower The stack representing a tower.
     * @return A string representation of the disks in the tower.
     */
    private static String towerToString(Stack<Disk> tower) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = tower.size() - 1; i >= 0; i--) {
            sb.append(tower.get(i).getSize());
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}