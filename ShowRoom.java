import java.util.Scanner;

class ShowRoom{
    private String name;
    private long mobno;
    private double cost;
    private double dis;
    private double amount;


    public void input(){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = sc.nextLine();
        System.out.print("Enter mobile number: ");
        mobno = sc.nextLong();
        System.out.print("Enter cost of items purchased: ");
        cost = sc.nextDouble();
        sc.close();
    }

    public void calculate(){
        if(cost <= 10000){
            dis= 0.05 * cost;
        }else if(cost <= 20000){
            dis= 0.10 * cost;
        }else if(cost <= 35000){
            dis= 0.15 * cost;
        }else{
            dis= 0.20 * cost;
        }
    }

    public void display(){
        amount= cost - dis;
        System.out.println("Customer name: " + name);
        System.out.println("Mobile number: " + mobno);
        System.out.println("Amount to be paid after discount: " + amount); 
    }

    public static void main(String args[]){
        ShowRoom showroom = new ShowRoom();
        showroom.input();
        showroom.calculate();
        showroom.display();
    }

}