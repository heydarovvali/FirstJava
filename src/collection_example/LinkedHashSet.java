package collection_example;

public class LinkedHashSet {
    public static void main(String[] args) {

        java.util.LinkedHashSet<String> gunler = new java.util.LinkedHashSet<>();
        gunler.add("bazar ertesi");
        gunler.add("cersenbe axsami");
        gunler.add("cersenbe");
        gunler.add("cuma axsami");
        gunler.add("cume");
        gunler.add("senbe");
        gunler.add("bazar");
        gunler.add(null);

        // qeyd: bunun HashSet-den ferqi giris siralarindadir

        gunler.add("bazar ertesi");
        gunler.remove("bazar");

        gunler.forEach(item -> System.out.println(item + ", "));

    }
}
