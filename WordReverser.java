import java.util.Scanner;

public class WordReverser {
    public static String reverseWords(String string) {
        // Split the string into words
        String[] words = string.split("\\s+");
        
        // Reverse each word using a for loop
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord);
            
            // Append a whitespace after each word, except the last word
            if (i != words.length - 1) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String reversedString = reverseWords(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}
