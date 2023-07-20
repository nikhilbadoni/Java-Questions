import java.util.LinkedList;

public class RetrieveLastElementLinkedList {
    public static void main(String[] args) {
        // Creating a LinkedList and adding elements to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Calling the peekLast() method to retrieve the last element because it doesn't remove the last element
        // We can also use getLast() method.
        String lastElement = linkedList.peekLast();

        // Printing the last element
        System.out.println("Last Element of the Linked List: " + lastElement);

        // The linked list remains unchanged
        System.out.println("Updated Linked List: " + linkedList);
    }
}

/*
OUTPUT:-

 Last Element of the Linked List: Mango
Updated Linked List: [Apple, Banana, Orange, Mango]
 */