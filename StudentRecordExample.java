import java.util.Scanner;

public class StudentRecordExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        int[] rollNumbers = new int[10];
        String[] grades = new String[10];

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Enter details for Student " + (i + 1) + ":");
                System.out.print("Name: ");
                names[i] = scanner.nextLine();
                System.out.print("Roll Number: ");
                rollNumbers[i] = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Grade: ");
                grades[i] = scanner.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Error: Maximum number of student records reached.");
                break; 
            }
        }
        scanner.close();

        System.out.println("\nStudent Records:");
        for (int i = 0; i < 10 && names[i] != null; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }
    }
}
