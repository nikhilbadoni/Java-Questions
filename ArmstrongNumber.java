import java.util.Scanner;

public class ArmstrongNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        int numDigits = 0;
        
        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }
        
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        scanner.close();
    }
}
