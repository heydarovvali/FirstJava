package inheritance_example2;

public class Kia extends Bentley{
    @Override
    void color() {
        System.out.println("white");
    }

    @Override
    void topspeed() {
        System.out.println("180 km");
    }

    @Override
    void horsePower() {
        System.out.println("180");
    }
}
