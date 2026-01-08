interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started");
    }
}

// Static Method
public class Main {
    static void display() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Main.display();
        display();
    }
}
