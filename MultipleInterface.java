// You are using Java
// create two interface with the name cook and driver and inside cook interface create a method prepare food and inside driver interface.
// create a method drive vehicle.Now create a class multifunctional rerobot and implement cook and driver interface.


interface cook{
    void prepareFood();
}
interface driver{
    void driveVehicle();
}
public class MultipleInterface implements cook, driver{
    public void prepareFood(){
        System.out.println("Robot is preparing food...");
    }
    public void driveVehicle(){
        System.out.println("Robot is Driving...");
    }
}
class test{
    public static void main(String [] args){
        MultipleInterface m = new MultipleInterface();
        m.prepareFood();
        m.driveVehicle();
    }
}
