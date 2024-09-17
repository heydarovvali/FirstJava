package collection_example;

public class TreeSet {
    public static void main(String[] args) {

        java.util.TreeSet tree = new java.util.TreeSet();
        tree.add(10);
        tree.add(1);
        tree.add(2);
        tree.add(6);

        //qeyd: digerlerinden ferqi siralama ile yazir
        try {
            tree.add(null);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        tree.forEach(item -> System.out.println(item));
    }
}
