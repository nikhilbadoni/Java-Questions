import java.util.ArrayList;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Creating the first ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Creating the second ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        // Printing the first and second ArrayList
        System.out.println("First  ArrayList: " + list1);
        System.out.println("Second  ArrayList: " + list2);
        // Joining the two ArrayLists using addAll() method
        list1.addAll(list2);

        // Printing the joined ArrayList
        System.out.println("Joined ArrayList: " + list1);
    }
}
/*
OUTPUT:-
First  ArrayList: [1, 2, 3]
Second  ArrayList: [4, 5, 6]
Joined ArrayList: [1, 2, 3, 4, 5, 6]
 */