import java.util.Scanner;

public class MarksResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + i + ": ");
            double marksObtained = scanner.nextDouble();
            totalMarks += marksObtained;
        }

        double percentage = (totalMarks / (numSubjects * 100)) * 100;

        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 90) {
            System.out.println("Grade: Excellent");
        } else if (percentage >= 80) {
            System.out.println("Grade: Good");
        } else if (percentage >= 40) {
            System.out.println("Grade: Pass");
        } else {
            System.out.println("Grade: Fail");
        }

        scanner.close();
    }
}
