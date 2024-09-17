package stream_api_example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Toyota");

        ArrayList<String> newCars = new ArrayList<>();


        System.out.println(cars);
//        cars.forEach((i)-> System.out.println(" " +i));
        cars.forEach((i) -> newCars.add(i));
        newCars.forEach((a) -> System.out.println(" " + a));
        System.out.println("--------------------");
        System.out.println(newCars);

//        Melumat a = new Melumat() {
//            @Override
//            public void goster() {
//                System.out.println("Hello World");
//            }
//        };

        Melumat b = (name, age) -> {      // qisa yol
            System.out.println("salam " + name + age);
            return age;
        };
        b.goster("Vali ", 28);
    }
}
