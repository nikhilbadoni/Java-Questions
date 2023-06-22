import java.util.Scanner;

public class Bank {
    private int accountNumber;
    private String customerName;
    private double balance;
    private double interestRate;

    public Bank(int acctNumber, String custName, double initialBalance, double intRate){
        accountNumber = acctNumber;
        customerName = custName;
        balance = initialBalance;
        interestRate = intRate; 
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful.");
        } else {
             System.out.println("Insufficient funds to make the withdrawal.");
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

     public double calculateInterest() {
        return balance * (interestRate / 100);
    }

     public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Available Balance: Rs." + balance);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter Interest Rate (%): ");
        double interestRate = scanner.nextDouble();

        Bank bankAccount  = new Bank(accountNumber, customerName, initialBalance, interestRate);
        bankAccount.display();

         int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Account Information");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawalAmount);
                    break;
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    double interest = bankAccount.calculateInterest();
                    System.out.println("Interest earned: Rs." + interest);
                    break;
                case 4:
                    bankAccount.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();


    }
}
