import java.util.Scanner;

public class WordCountUsinginBuilt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        inputString = inputString.trim();
        
        String[] words = inputString.split("\\s+");
        
        // Count the number of words
        int wordCount = words.length;
        
        System.out.println("Number of words: " + wordCount);
        scanner.close();
    }
}
