import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a month number
        System.out.print("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        // Initialize a variable to hold the month name
        String monthName;

        // Use a switch case to determine the month name based on the input
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }

        // Display the month name on the screen
        System.out.println("The month is: " + monthName);

        // Close the scanner
        scanner.close();
    }
}

