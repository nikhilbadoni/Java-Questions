import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scanner.close();
    }
}
