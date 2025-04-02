// You are using Java
// wap to execute an arithmatic exception by using try and catch block.
public class ExceptionTryCatch_1{
    public static void main(String [] args){
        try{
            int a = 20;
            int b = 0;
            int result = a/b;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException error) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
        System.out.println("Program continues...");

    }
    
}