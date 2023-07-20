import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {
    public static void main(String[] args) {
        // Creating a LinkedList and add elements to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Creating an ArrayList and converting the linked list to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(linkedList);

        // Printing the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Printing the converted ArrayList
        System.out.println("Converted ArrayList: " + arrayList);
    }
}
/*
OUTPUT:-
Original Linked List: [Apple, Banana, Orange, Mango]
Converted ArrayList: [Apple, Banana, Orange, Mango]
 */
