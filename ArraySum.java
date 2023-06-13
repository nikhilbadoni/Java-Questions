import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize an array
        int[] array = new int[size];

        // Take input for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Display the sum
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }
}
