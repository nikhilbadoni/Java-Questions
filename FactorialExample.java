import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        scanner.close();
    }
        

    public static long calculateFactorial(int number) throws Exception {
        if (number <= 1) {
            throw new Exception("Number must be greater than 1.");
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
    
}
