import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Do you want to find the area of a circle? (Enter 'yes' or 'no'): ");
            input = scanner.nextLine().toLowerCase();

            if (input.equals("yes")) {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                double area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                scanner.nextLine(); 
            } else if (!input.equals("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }

            System.out.println(); 

        } while (!input.equals("no"));

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
