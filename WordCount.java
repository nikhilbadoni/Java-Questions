import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
                if (!isWord) {
                    isWord = true;
                    wordCount++;
                }
            } else {
                isWord = false;
            }
        }
        scanner.close();
        System.out.println("Number of words in the string: " + wordCount);
    }
}
