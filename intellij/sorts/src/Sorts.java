/*
 * Project: Sorts
 * Author: Ryan Brinkman
 * Date: March 10, 2025
 * GitHub Repository: https://github.com/RyanBrin/java/tree/main/intellij/sorts/
 */

public class Sorts {

    public static void selectionSort(int[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                count++;
                if (list[j] < list[i]) {
                    int temp = list[j];
                    list[j] = list[i];
                    list[i] = temp;
                }
            }
        }
        System.out.println("Selection Sort: " + count + " comparisons");
    }

    public static void selectionSort(Comparable[] list) {
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                count++;
                if (list[j].compareTo(list[i]) < 0) {
                    Comparable temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        System.out.println("Selection Sort: " + count + " comparisons");
    }

    public static void insertionSort(int[] list) {
        int count = 0;
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                count++;
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        System.out.println("Insertion Sort: " + count + " comparisons");
    }

    public static void insertionSort(Comparable[] list) {
        int count = 0;
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j].compareTo(key) > 0) {
                count++;
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
        System.out.println("Insertion Sort: " + count + " comparisons");
    }
}