
import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        scanner.close();

        boolean found = false;
        int index = -1;

        for (int i = 0; i < length; i++) {
            if (array[i] == target) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " found at Index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
