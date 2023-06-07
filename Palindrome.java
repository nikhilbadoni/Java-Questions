import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            boolean exit = false;
            do{
                System.out.println("Enter a Number (Enter 0 to exit)");
                num = sc.nextInt();
                if (num == 0){
                    exit = true;
                    break;
                }
                // Converting the number to string
                String numStr = String.valueOf(num);
                // Reversing the string
                String reversedStr = new StringBuilder (numStr).reverse().toString();
                // Checking if reversed string and original string are same or not.
                if (numStr. equals(reversedStr)) {
                    System.out.println(num + " is a palindrome!");
                } else{
                    System.out.println(num + " is not a palindrome!");
                }  
            } while(!exit);
        }
        System.out.println("Exiting the Program");
    }
    
}

