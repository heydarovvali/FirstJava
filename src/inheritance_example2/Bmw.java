package inheritance_example2;

public class Bmw extends Bentley {

    @Override
    void color() {
        System.out.println("black");
    }

    @Override
    void horsePower() {
        System.out.println("425");
    }

    @Override
    void topspeed() {
        System.out.println("300");
    }


}
