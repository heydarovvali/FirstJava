package inheritance_example3;

public class Audi extends Car {
    @Override
    void mark() {
        System.out.println("Audi Q7");
    }

    @Override
    void engine() {
        System.out.println("4.2");
    }

    @Override
    void color() {
        System.out.println("Gray");
    }
}
