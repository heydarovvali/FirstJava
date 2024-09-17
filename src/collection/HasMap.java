package collection;

import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hmp = new HashMap<Integer, String>();
        hmp.put(23,"bmw");
        hmp.put(25,"audi");
        hmp.put(50,"dodge");
        hmp.put(66, "opel");

        hmp.remove(23);

        System.out.println(hmp);

    }
}
