import java.util.Scanner;

public class DivideByZeroExample {
    public static void main(String[] args) {
        int numerator, denominator, result;

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter the numerator: ");
        numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        denominator = scanner.nextInt();

        
        result= numerator/denominator;
        System.out.println("The Answer is: " + result);

        scanner.close();
        
        }
        catch(ArithmeticException e){
            System.out.println("Divide By Zero Exception occured...");

        }
        
    }
}
    

