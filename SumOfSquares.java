import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int squareSum = 0;
        for (int i = 0; i < size; i++) {
            int num = array[i];
            int square = num * num;
            System.out.println("Square of element " + num + ": " + square);
            squareSum += square;
        }
        
        System.out.println("Sum of squares: " + squareSum);
        
        scanner.close();
    }
}
