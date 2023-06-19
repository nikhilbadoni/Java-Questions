import java.util.Scanner;

public class DuplicateCharacterFind {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (input == null || input.isEmpty()) {
                System.out.println("Invalid input!");
                return;
            }

            System.out.println("Duplicate characters in the string:");

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                for (int j = i + 1; j < input.length(); j++) {
                    if (c == input.charAt(j)) {
                        System.out.println(c);
                        break;
                    }
                }
            }
        }
    }
}
