public class CommandLineSubtraction {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Subtraction <number1> <number2>");
        } else {
            try {
                int number1 = Integer.parseInt(args[0]);
                int number2 = Integer.parseInt(args[1]);
                int subtraction = number1 - number2;
                System.out.println("Subtraction of " + number1 + " and " + number2 + " is: " + subtraction);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
            }
        }
    }
}
