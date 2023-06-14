import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        scanner.close();

        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int maxNum = array[0];
        int minNum = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }

        System.out.println("Maximum element: " + maxNum);
        System.out.println("Minimum element: " + minNum);
    }
}
