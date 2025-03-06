// You are using Java
// create interface client and provide the method input and output inside the interface.
// create a class where the client will takes name salary from the user and the ouput method will print the result.

import java.util.*;
interface client{
    void input();
    void output();
}
public class Interface1 implements client{
    String name;
    long salary;
    public void input(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = obj.nextLine();
        System.out.println("Enter the salary");
        salary = obj.nextLong();
        obj.close();
    }
    public void output(){
        System.out.println("Name is: "+name);
        System.out.println("Salary is: "+salary);
        
    }
    public static void main(String [] args){
        Interface1 s = new Interface1();
        s.input();
        s.output();
    }
    
    
}
