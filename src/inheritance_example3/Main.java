package inheritance_example3;

public class Main {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.engine();
        audi.color();
        audi.mark();

        System.out.println();

        Mercedes mercedes = new Mercedes();
        mercedes.mark();
        mercedes.engine();
        mercedes.color();
    }
}
