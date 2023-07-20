import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Printing the original ArrayList
        System.out.println("Original ArrayList: " + fruits);

        // Specifying the element to replace the second element with
        String replacement = "Grapes";

        // Replacing the second element with the specified element using set() method
        if (fruits.size() >= 2) {
            fruits.set(1, replacement);
            System.out.println("Second element replaced with: " + replacement);
        } else {
            System.out.println("The ArrayList doesn't have enough elements to replace the second element.");
        }

        // Print the updated ArrayList
        System.out.println("Updated ArrayList: " + fruits);
    }
}
/*
OUTPUT:-
Original ArrayList: [Apple, Banana, Orange, Mango]
Second element replaced with: Grapes
Updated ArrayList: [Apple, Grapes, Orange, Mango]
 */