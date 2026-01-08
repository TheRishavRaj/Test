abstract class shape {
    abstract void draw();
}

public class Circle extends shape {
    void draw() {
        System.out.println("Drawing Cirlce");
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.draw();
    }
}
