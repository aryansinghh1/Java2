class Shape {
    void draw() {
        
        System.out.println("Can't say the shape..");
    }
}

public class override1 extends Shape {
    @Override
    void draw() {
        super.draw();
        System.out.println("Square shape");
    }

    public static void main(String[] args) {
        override1 r = new override1();
        r.draw();
    }
}