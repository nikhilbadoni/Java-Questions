import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        int choice;
        
        do {
            System.out.println("---- Mini Calculator ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextInt();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            
            System.out.println(); 
            scanner.close();
            
        } while (choice != 5);
    }
}
