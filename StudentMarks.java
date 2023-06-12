import java.util.Scanner;
public class StudentMarks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        double[] marks = new double[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Enter the Name of the Student " + (i+1) + ":");
            names[i] = sc.nextLine(); 
            
            System.out.println("Enter the Marks of the Student " + (i+1) + ":");
            marks[i] = Double.parseDouble(sc.nextLine());

        }
        System.out.println("\nName\t\t\tMarks");
        System.out.println("---------------------");
        for(int i = 0; i < 10; i++){
           System.out.println(names[i] + "\t\t" + marks[i]);
        }
        sc.close();
    }
    
}
