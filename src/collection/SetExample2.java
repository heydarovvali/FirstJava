package collection;

import java.util.HashSet;

public class SetExample2 {
    public static void main(String[] args) {
        HashSet<String> car = new HashSet<String>();
        car.add("Bmw");
        car.add("Mercedes");
        car.add("Audi");
        car.add("Lexus");
        car.add("Opel");

        car.remove("Opel");

        System.out.println(car);
    }
}
