public class CommandLineSum {
    public static void main(String args[]){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int d = Integer.parseInt(args[3]);
            int e = Integer.parseInt(args[4]);
            int sum = a+b+c+d+e;
            System.out.println("Sum is " + sum);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Occured: Please Enter 5 Numbers");
        }
    }
    
}
