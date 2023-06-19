import java.util.Scanner;

public class DuplicateCharacterFinder {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (input == null || input.isEmpty()) {
                System.out.println("Invalid input!");
                return;
            }

            boolean[] visited = new boolean[256];
            boolean[] duplicates = new boolean[256];

            char[] inputChars = input.toCharArray();
            for (int i = 0; i < inputChars.length; i++) {
                char c = inputChars[i];

                if (visited[c]) {
                    duplicates[c] = true;
                } else {
                    visited[c] = true;
                }
            }

            System.out.println("Duplicate characters in the string:");
            for (int i = 0; i < duplicates.length; i++) {
                if (duplicates[i]) {
                    System.out.println((char) i);
                }
            }
        }
        
    }
    
}
