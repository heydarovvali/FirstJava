package class_object_homework;

public class MainClassHomeWork {
    public static void main(String[] args) {
        Car Bmw = new Car();
        Car Mercedes = new Car();
        Car Audi = new Car();


        Bmw.model = "M5";
        Bmw.color = "Black";
        Bmw.price = 150000;
        Bmw.enginePower = 4.4;

        System.out.println(Bmw.model);
        System.out.println(Bmw.color);
        System.out.println(Bmw.price);
        System.out.println(Bmw.enginePower);

        System.out.println("---------------");


        Mercedes.model = "G63";
        Mercedes.color = "Gray";
        Mercedes.price = 140000;
        Mercedes.enginePower = 5.5;

        System.out.println(Mercedes.model);
        System.out.println(Mercedes.color);
        System.out.println(Mercedes.price);
        System.out.println(Mercedes.enginePower);

        System.out.println("---------------");


        Audi.model = "S8";
        Audi.color = "Blue";
        Audi.price = 130000;
        Audi.enginePower = 4.2;

        System.out.println(Audi.model);
        System.out.println(Audi.color);
        System.out.println(Audi.price);
        System.out.println(Audi.enginePower);







    }
}
