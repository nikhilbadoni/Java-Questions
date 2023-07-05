public class FinallyExample{
    public static void divideNumbers(int a, int b){
        try {
            int result = a/b;
            System.out.println("Division Result: "+ result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Division by zero or other arithmetic error occurred.");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }

    public static void main(String args[]){
        divideNumbers(10, 5);
        divideNumbers(4, 0);
    }
}