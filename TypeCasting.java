public class TypeCasting {
    public static void main(String args[]){
        double pi= 3.14;
        System.out.println("Value of pi "+ pi);
        
        int piInt= (int)pi; // downcasting
        System.out.println(piInt);

        double piDouble = piInt; // upcasting
        System.out.println(piDouble);
    }
    
}
