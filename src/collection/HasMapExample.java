package collection;

import java.util.HashMap;

public class HasMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> phone = new HashMap<Integer, String>();
        phone.put(10, "Iphone");
        phone.put(20, "Samsung");
        phone.put(30, "Lg");
        phone.put(40, "Honor");

        phone.remove(40);
        System.out.println(phone);

    }
}
