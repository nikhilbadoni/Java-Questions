import java.util.Scanner;

public class XStringConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String original = scanner.nextLine();
        String converted = "";

        if (original.length() <= 4) {
            converted = original;
        } else {
            for (int i = 0; i < original.length() - 4; i++) {
                converted += "X";
            }
            converted += original.substring(original.length() - 4);
        }

        System.out.println("Converted string: " + converted);
        scanner.close();
    }
}
