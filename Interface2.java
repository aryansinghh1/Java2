// You are using Java
// create a interface vehicle and include start and stop method in it.
// create two classes for different vehicle  and implement the method.

interface Vehicle {
    void start();
    void stop();
}

class Accsses125 implements Vehicle {
    public void start() {
        System.out.println("Accsses125 is starting...");
    }

    public void stop() {
        System.out.println("Accsses125 is stopping...");
    }
}

class SP125 implements Vehicle {
    public void start() {
        System.out.println("SP125 is starting...");
    }

    public void stop() {
        System.out.println("SP125 is stopping...");
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Vehicle scooty = new Accsses125();
        Vehicle bike = new SP125();

        scooty.start();
        scooty.stop();

        bike.start();
        bike.stop();
    }
}
