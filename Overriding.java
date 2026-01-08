class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();
    }
}
