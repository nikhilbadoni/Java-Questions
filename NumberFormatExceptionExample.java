import java.util.Scanner;

public class NumberFormatExceptionExample{
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);

        try{
            System.out.println("Enter a Number: ");
            String input= scanner.nextLine();
            int number= Integer.parseInt(input);
            System.out.println("You Entered: "+ number); 
            scanner.close();

        }
        catch(NumberFormatException e) 
        {
            System.out.println("Invalid input! Enter a valid Number");

        }
    }
}