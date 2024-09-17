package collection_example;

import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet {
    public static void main(String[] args) {

        HashSet h = new HashSet();
        h.add("12 str");
        h.add(12);
        h.add(14.0);
       // h.add(true);
        h.add(null);

        // HashSetin icinde iki dene eyni sey ola bilmez

       // h.remove(12);
        System.out.println(h.contains("12 str"));
        System.out.println(h.size());

        Iterator itr = h.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
