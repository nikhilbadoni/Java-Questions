import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String string) {
        
        string = string.replaceAll(" ", "").toLowerCase();
        
        
        StringBuilder reversedString = new StringBuilder(string).reverse();
        if (string.equals(reversedString.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
