package polymorphism;

public class MainOOPPolymorphism {
    public static void main(String[] args) {

        Car car = new Car();
        car.driving(2);

        Car car2 = new Kia(); // upcasting: alt sinifin obyektini ust sinifin referensine menimsetme
        car2.driving();

        Car car3 = new Mercedes();
        car3.driving();

    }
}
