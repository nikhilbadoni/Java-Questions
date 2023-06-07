public class ValidUser {
    public static void main(String args[]){
        try{
            String enteredName = args[0];
            String validName = "nikhil";
            if(enteredName.equalsIgnoreCase(validName)){
                System.out.println("User Name is Valid");
            }
            else{
                System.out.println("User Name is not Valid");
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error Occured : Please Enter a Name");
        }
    }
    
}
