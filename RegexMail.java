//import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexMail {

    public static boolean isValidEmail(String email) {
        String emailRegex = "[a-zA-Z0-9_.-]+@[a-zA-Z0-9.-]+\\.com";
        return Pattern.matches(emailRegex, email);
    }

    public static void main(String[] args) {
        String email = "testexample@gmail.com";
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter an email address: ");
        //String email = scanner.nextLine();
        //scanner.close();

        boolean isValid = isValidEmail(email);
        System.out.println("Is email valid? " + isValid);
    }
}
