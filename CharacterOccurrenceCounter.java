import java.util.Scanner;

public class CharacterOccurrenceCounter {
    public static int countCharacterOccurrence(String str, char ch) {
        
        str = str.toLowerCase();

        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String givenString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char givenChar = scanner.nextLine().charAt(0);
        scanner.close();

        int occurrence = countCharacterOccurrence(givenString, givenChar);

        System.out.println("The character '" + givenChar + "' occurs " + occurrence + " times in the string.");
    }
}
