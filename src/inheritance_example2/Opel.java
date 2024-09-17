package inheritance_example2;

public class Opel extends Bentley{
    @Override
    void color() {
        System.out.println("white rengi");
    }

    @Override
    void topspeed() {
        System.out.println("200");
    }

    @Override
    void horsePower() {
        System.out.println("150  at gucu" );
    }
}
