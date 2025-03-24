/*
 * Project: Sorts
 * Author: Ryan Brinkman
 * Date: March 10, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/sorts/
 */

public class Sorts {
    private static int iterations; // Tracks the number of comparisons made in sorting methods

    /**
     * Performs Selection Sort on an array of integers.
     *
     * @param list the array of integers to be sorted
     */
    public static void selectionSort(int[] list) {
        int iterations = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                iterations++;
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element found with the first element
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        System.out.println("Selection Sort: " + iterations + " comparisons");
    }

    /**
     * Performs Selection Sort on an array of Comparable objects.
     *
     * @param list the array of Comparable objects to be sorted
     */
    public static void selectionSort(Comparable[] list) {
        int iterations = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                iterations++;
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the smallest element found with the first element
            if (minIndex != i) {
                Comparable temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
        System.out.println("Selection Sort: " + iterations + " comparisons");
    }

    /**
     * Performs Insertion Sort on an array of integers.
     *
     * @param list the array of integers to be sorted
     */
    public static void insertionSort(int[] list) {
        int iterations = 0;
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            // Move elements of list[0..i-1] that are greater than key to one position ahead
            // of their current position
            while (j >= 0 && list[j] > key) {
                iterations++;
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
            iterations++;
        }
        System.out.println("Insertion Sort: " + iterations + " comparisons");
    }

    /**
     * Performs Insertion Sort on an array of Comparable objects.
     *
     * @param list the array of Comparable objects to be sorted
     */
    public static void insertionSort(Comparable[] list) {
        int iterations = 0;
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;

            // Move elements of list[0..i-1] that are greater than key to one position ahead
            // of their current position
            while (j >= 0 && list[j].compareTo(key) > 0) {
                iterations++;
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
            iterations++;
        }
        System.out.println("Insertion Sort: " + iterations + " comparisons");
    }

    /**
     * Performs Merge Sort on an array of Comparable objects.
     *
     * @param list  the array of Comparable objects to be sorted
     * @param start the starting index of the array segment
     * @param end   the ending index of the array segment
     */
    public static void mergeSort(Comparable[] list, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(list, start, mid);
            mergeSort(list, mid + 1, end);
            merge(list, start, mid, end);
        }
    }

    /**
     * Merges two sorted subarrays into a single sorted array.
     *
     * @param list  the array containing the subarrays to merge
     * @param start the starting index of the first subarray
     * @param mid   the ending index of the first subarray
     * @param end   the ending index of the second subarray
     */
    private static void merge(Comparable[] list, int start, int mid, int end) {
        Comparable[] temp = new Comparable[list.length];
        System.arraycopy(list, start, temp, start, end - start + 1);

        int i = start, j = mid + 1, k = start;
        while (i <= mid && j <= end) {
            iterations++;
            if (temp[i].compareTo(temp[j]) <= 0) {
                list[k++] = temp[i++];
            } else {
                list[k++] = temp[j++];
            }
        }

        while (i <= mid) {
            list[k++] = temp[i++];
        }

        while (j <= end) {
            list[k++] = temp[j++];
        }
    }

    /**
     * Wrapper method to perform Merge Sort on a Comparable array and print comparisons.
     *
     * @param list the array of Comparable objects to be sorted
     */
    public static void runMergeSort(Comparable[] list) {
        iterations = 0; // Reset iterations counter
        mergeSort(list, 0, list.length - 1);
        System.out.println("Merge Sort: " + iterations + " comparisons");
    }
}