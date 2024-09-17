package inheritance_example3;

public class Mercedes extends Car {
    @Override
    void mark() {
        System.out.println("E320");
    }

    @Override
    void engine() {
        System.out.println("3.2");
    }

    @Override
    void color() {
        System.out.println("Black");
    }
}
