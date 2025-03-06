class Again {
    public int add(int a, int b) {
        return a + b;
    }

}

class Gg extends Again {
    public double add(double a, double b) {
        return a + b;
    }

}

public class Overloading {
    public static void main(String[] args) {
        Gg obj = new Gg();
        System.out.println("Addition is: " + obj.add(4, 5));
        System.out.println("Addition is: " + obj.add(4.45, 5.5));
    }
}
