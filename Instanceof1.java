// You are using Java
// write a program for instanceof operator where the class will be pet and there will be two subclasses which will inherit the class pet.
// create a program to check whether the instanceof operator is working on both the subclasses or not.

class Pet{}
class Child1 extends Pet{}
class Child2 extends Pet{}

public class Instanceof1{
    public static void main(String [] args){
        Pet p = new Pet();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        
        System.out.println(p instanceof Pet);
        System.out.println(c1 instanceof Child1);
        System.out.println(c2 instanceof Child2);
    }
}