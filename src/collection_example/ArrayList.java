package collection_example;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList country = new java.util.ArrayList<>();
        country.add("Baku");
        country.add("Sidney");
        country.add("Berlin");
        country.add("Baku");

        // qeyd: axtarislari rahat etmek olur.

        country.add(0,"Roma");
        country.remove(1);

        Iterator itr = country.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //country.forEach(i -> System.out.println(i));


    }
}
