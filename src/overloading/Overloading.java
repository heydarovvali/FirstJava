package overloading;

public class Overloading {
    public static void main(String[] args) {

        System.out.println(topla(2, 3));
        System.out.println(topla(2.3, 3.2));
        System.out.println(topla(2, 3, 4));
        System.out.println(topla(2, 3, 4, 5));

    }

    public static int topla(int a, int b) {
        return a * b;
    }

    public static int topla(int a, int b, int c) {
        return a * b * c;
    }

    public static int topla(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    public static double topla(double a, double b) {
        return a * b;
    }
}
