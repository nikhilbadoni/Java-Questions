
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        scanner.close();

        Arrays.sort(array);
        
        int current = array[0];
        int previous = array[0];
        
        System.out.println(current);
        
        for (int i = 1; i < array.length; i++) {
            current = array[i];
            
            if (current != previous) {
                System.out.println(current);
            }
            
            previous = current;
        }
    }
}
