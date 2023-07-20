import java.util.LinkedList;
import java.util.Iterator;

public class IterateLinkedListInReverse {
    public static void main(String[] args) {
        // Creating a LinkedList and add elements to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        //Printing the original Linked List
        System.out.println("Original Linked List: " + linkedList);
        // Getting the descending iterator
        Iterator<String> descendingIterator = linkedList.descendingIterator();

        // Iterating the linked list in reverse order
        System.out.println("Linked List elements in reverse order:");
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }
}

/*
OUTPUT:- 
Original Linked List: [Apple, Banana, Orange, Mango]
Linked List elements in reverse order:
Mango
Orange
Banana
Apple
 */