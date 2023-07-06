import java.util.Scanner;

public class VotingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.close();

        try {
            checkEligibility(age);
            System.out.println("You are eligible to vote!");
            // Further logic for voting can be added here
        } catch (AgeException ex) {
            System.out.println("Error: " + ex.getMessage());
            // Terminate the program or handle the error as needed
        }
    }

    static void checkEligibility(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be at least 18 years old to vote.");
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
