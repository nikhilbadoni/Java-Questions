class BankCustomer {
    private int acno;
    private String atype;
    private double amt;

    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    public BankCustomer(int acno, String atype) {
        this.acno= acno;
        this.atype= atype;
    }

    public void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer(123456, "Savings", 5000.0);
        BankCustomer customer2 = new BankCustomer(654321, "Current");

        customer1.display();
        System.out.println("--------------------");
        customer2.display();
    }
}
