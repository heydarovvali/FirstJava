package collection_example;

public class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList list = new java.util.LinkedList();
        list.add("Bmw");
        list.add("Audi");
        list.add("Lexus");
// elava etmek ucun ve silmek ucun daha yaxsidir

        list.add(1,"Toyota");

        list.forEach(i-> System.out.println(i));

    }
}
