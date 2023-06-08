public class StudentRecord {
    
    public static void main(String[] args) {
        
        String[] studentNames = {"Nikhil", "Divyanshu", "Shubham", "Vivek", "Alok"};
        int[] studentMarks = {80, 65, 45, 70, 55};
        
        
        System.out.println("Students with marks > 50%:");
        for (int i = 0; i < studentNames.length; i++) {
            if (studentMarks[i] > 50) {
                System.out.println("Name: " + studentNames[i] + ", Marks: " + studentMarks[i]);
            }
        }
    }
}
