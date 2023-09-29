import java.util.Scanner;
public class StudentMark {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i =0; i < 10; i++){
            // taking input here
            sum += scanner.nextInt();
        }
        // printing total sum
        System.out.println("Total Sum is : " +  sum);
        scanner.close();
    }   
    
}
