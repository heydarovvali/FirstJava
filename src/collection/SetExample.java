package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        HashSet<String> rr = new HashSet<String>();
        rr.add("Vali");
        rr.add("Orxan");
        rr.add("Ali");
        rr.add("Turan");
        rr.add("Vali");

        rr.remove("Orxan");

        System.out.println(rr);


    }
}
