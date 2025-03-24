/*
 * Project: Towers of Hanoi
 * Author: Ryan Brinkman
 * Date: March 20, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/towers-of-hanoi/
 */

/*
 * Non thread-utilizing version
 */
/*public class TowersOfHanoi {

    //public static void main(String[] args) {
    //    int numDisks = 7;
    //    int numIterations = solveHanoi(numDisks, 'A', 'B', 'C', 0);
    //    System.out.println(numDisks + " disks took " + numIterations + " iterations to complete.");
    //}

    //public static int solveHanoi(int numDiscs, char source, char auxiliary, char destination, int numIterations) {
    //    if (numDiscs == 1) {
    //        numIterations++;
    //        System.out.println("[" + numIterations + "] Moved disk 1 from " + source + " to " + destination);
    //        return numIterations;
    //    }
    //    numIterations = solveHanoi(numDiscs - 1, source, destination, auxiliary, numIterations);
    //    numIterations++;
    //    System.out.println("[" + numIterations + "] Moved disk " + numDiscs + " from " + source + " to " + destination);
    //    numIterations = solveHanoi(numDiscs - 1, auxiliary, source, destination, numIterations);
    //    return numIterations;
    //}
}*/

/*
 * Thread-utilizing version
 */
public class TowersOfHanoi {

    /**
     * The main method serves as the entry point for the thread-utilizing version of the Towers of Hanoi program.
     * It initializes the number of disks and starts a new thread to solve the puzzle.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        int numDisks = 20   ;
        Thread mainThread = new Thread(() -> {
            int numIterations = solveHanoi(numDisks, 'A', 'B', 'C', 0);
            System.out.println(numDisks + " disks took " + numIterations + " iterations to complete.");
        });

        mainThread.start(); // Start the main thread
        try {
            mainThread.join(); // Wait for the main thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Solves the Towers of Hanoi puzzle using threads to parallelize the recursive calls.
     *
     * @param numDiscs The number of disks to move.
     * @param source The source rod.
     * @param auxiliary The auxiliary rod used for intermediate steps.
     * @param destination The destination rod.
     * @param numIterations The current number of iterations (moves) made.
     * @return The total number of iterations (moves) made to solve the puzzle.
     */
    public static int solveHanoi(int numDiscs, char source, char auxiliary, char destination, int numIterations) {
        if (numDiscs == 1) {
            numIterations++;
            System.out.println("[" + numIterations + "] Moved disk 1 from " + source + " to " + destination);
            return numIterations;
        }

        final int[] iterationsHolder = { numIterations }; // Use an array to safely update iterations within lambdas

        // Thread to solve the first recursive step
        Thread firstHalf = new Thread(() -> {
            iterationsHolder[0] = solveHanoi(numDiscs - 1, source, destination, auxiliary, iterationsHolder[0]);
        });

        // Thread to solve the second recursive step
        Thread secondHalf = new Thread(() -> {
            iterationsHolder[0] = solveHanoi(numDiscs - 1, auxiliary, source, destination, iterationsHolder[0]);
        });

        try {
            firstHalf.start(); // Start the first half of the solution
            firstHalf.join(); // Ensure the first half is completed before proceeding

            iterationsHolder[0]++;
            System.out.println("[" + iterationsHolder[0] + "] Moved disk " + numDiscs + " from " + source + " to " + destination);

            secondHalf.start(); // Start the second half of the solution
            secondHalf.join(); // Ensure the second half is completed before returning
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return iterationsHolder[0];
    }
}