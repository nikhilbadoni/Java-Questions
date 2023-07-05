public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            func1();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " );
        }
    }

    public static void func1() {
        func2();
    }

    public static void func2() {
        int a = 10;
        int b = 0;
        int result = a / b; 
        System.out.println("Result: " + result);
    }
}
