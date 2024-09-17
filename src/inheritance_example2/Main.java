package inheritance_example2;

public class Main {
    public static void main(String[] args) {

        Bentley bentayga = new Bentley();
        bentayga.color();
        bentayga.topspeed();
        bentayga.horsePower();

        Bmw m2 = new Bmw();
        m2.color();
        m2.topspeed();
        m2.horsePower();

        Opel astra = new Opel();
        astra.color();
        astra.topspeed();
        astra.horsePower();

        Kia optima = new Kia();
        optima.color();
        optima.topspeed();
        optima.horsePower();

    }
}
