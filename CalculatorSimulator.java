import java.util.InputMismatchException;
import java.util.Scanner;

class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        if (empSal > 100000 && isIndian) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000 && isIndian) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000 && isIndian) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }
    }
}

class CalculatorSimulator {
    public static void main(String[] args) {
        try {
            // Get input from the user
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter employee name: ");
            String empName = scanner.nextLine();

            System.out.print("Is the employee an Indian citizen? (true/false): ");
            boolean isIndian = scanner.nextBoolean();

            System.out.print("Enter employee salary: ");
            double empSal = scanner.nextDouble();

            // Create an instance of TaxCalculator
            TaxCalculator calculator = new TaxCalculator();

            // Calculate tax
            double taxAmount = calculator.calculateTax(empName, isIndian, empSal);
            scanner.close();

            // Print tax amount
            System.out.println("Tax amount is: " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("Invalid Input. Please enter the correct Data type");
        }
    }
}