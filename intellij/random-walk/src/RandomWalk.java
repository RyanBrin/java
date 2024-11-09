/*
 * Ryan Brinkman
 * Random Walk
 * Page 154
 * 10/2/2024
 */

public class RandomWalk
{
    public static void main(String[] args)
    {
        // Declare variables
        int num;
        int steps;
        int greatestSteps = 0;
        double average = 0;
        double distance;

        for (int i = 0; i < 50; i++)
        {
            // Reset necessary variables
            steps = 0;
            distance = 3.5;

            // Generate random number and calculate steps
            do
            {
                steps++;

                num = (int) (Math.random() * 2); // Generate random number from 0 -> 1

                if (num == 1)
                {
                    distance++;

                }
                else
                {
                    distance--;

                }
            }
            while (distance < 7 && distance > 0);

            // Print out trial # and # of steps
            System.out.println("Trial " + (i + 1) + ": " + steps + " steps" );

            // Determine greatest # of steps
            if (steps > greatestSteps)
            {
                greatestSteps = steps;

            }

            // Accumulate steps into variable
            average += steps;

        }

        // Calculate average
        average /= 50;

        // Display results
        System.out.println("Average number of steps: " + average);
        System.out.println("Greatest number of steps: " + greatestSteps);

    }
}