import java.util.LinkedList;

public class JoinLinkedLists {
    public static void main(String[] args) {
        // Creating the first linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Creating the second linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //Printing the first and second linked list seperately
        System.out.println("First Linked List: " + list1);
        System.out.println("Second Linked List: " + list2);

        // Joining the two linked lists using addAll() method.
        list1.addAll(list2);

        // Printing the joined linked list
        System.out.println("Joined Linked List: " + list1);
    }
}

/*
 OUTPUT:-
First Linked List: [1, 2, 3]
Second Linked List: [4, 5, 6]
Joined Linked List: [1, 2, 3, 4, 5, 6]
 */