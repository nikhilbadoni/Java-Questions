public class DecrementExample {
    public static void main(String[] args) {
        int num = 5;

        // Post-decrement
        int postDecrement = num--;
        System.out.println("Post-decrement: " + postDecrement);  // Output: 5
        System.out.println("Updated value after post-decrement: " + num);  // Output: 4

        System.out.println();

        num = 5;  // Reset num to its original value

        // Pre-decrement
        int preDecrement = --num;
        System.out.println("Pre-decrement: " + preDecrement);  // Output: 4
        System.out.println("Updated value after pre-decrement: " + num);  // Output: 4
    }
}
