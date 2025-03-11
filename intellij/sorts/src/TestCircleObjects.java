/**
 * Test Circle Objects class
 */
public static void displayArray(Circle[] array) {
    for (Circle circle : array) {
        System.out.println(circle + " ");
    }
    System.out.println();
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numObjects;
    Circle[] test;

    System.out.print("Enter the number of Circle objects to create: ");
    numObjects = scanner.nextInt();

    test = new Circle[numObjects];

    for (int i = 0; i < numObjects; i++) {
        test[i] = new Circle((int) (101 * Math.random()));
    }

    System.out.println("Unsorted Array:");
    displayArray(test);

    System.out.println("Sorted Array:");

    System.out.println("Selection Sorted:");
    Sorts.selectionSort(test);

    System.out.println("Insertion Sorted:");
    Sorts.insertionSort(test);

}
