package super_keyword;

public class Bmw extends Car {
    void startBmw() {
        System.out.println("startBmw");
        super.start();
        super.maxSpeed = 400;

    }

    Bmw() {
        super(true);
    }

    Bmw(int a) {
        super();
    }
}
