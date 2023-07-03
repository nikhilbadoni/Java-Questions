import java.util.Scanner;

interface BankAccount{
    void deposit(double amount);
    void withdraw(double amount);
}

class CheckingAccount implements BankAccount{
    private double balance;

    public CheckingAccount(){
        balance= 0.0;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited Amount is " + balance); 
    }
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn Amount is " + balance); 
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
class Bank{
    public static void main(String args[]){
        CheckingAccount account = new CheckingAccount();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter the withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        sc.close();
    }

}