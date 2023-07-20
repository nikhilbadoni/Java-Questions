import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Printing the Unsorted Array List
        System.out.println("Unsorted ArrayList: " + numbers);

        // Sorting the ArrayList using Collections.sort()
        Collections.sort(numbers);

        // Printing the sorted ArrayList
        System.out.println("Sorted ArrayList: " + numbers);
    }
}

/*
 OUTPUT:-
 Unsorted ArrayList: [5, 2, 8, 1, 3]
 Sorted ArrayList: [1, 2, 3, 5, 8]
 */