import java.util.ArrayList;

public class ToArrayExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Integer[] numberArray = numbers.toArray(new Integer[numbers.size()]);

        System.out.println("Elements in the array:");
        for (Integer number : numberArray) {
            System.out.println(number);
        }
    }
}
/*
 import java.util.ArrayList;

public class ArrayListToArrayExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Akhi");
        names.add("Raj");
        names.add("Nik");

        String[] namesArray = names.toArray(new String[names.size()]);

        System.out.println("Elements in the array:");
        for (String name : namesArray) {
            System.out.println(name);
        }
    }
}

 */