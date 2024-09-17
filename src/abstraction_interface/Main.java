package abstraction_interface;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(     2);
        bicycle.speedUp(3);
        bicycle.appleyBrakes(1);

        System.out.println("Bicyle present state");
        bicycle.printStates();


        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.appleyBrakes(3);

        System.out.println("Bike present state");
        bike.printStates();


    }
}
