import java.util.Scanner;

public class Radius2 {
    public static void main(String[] args) {

        double pi = 3.14;
        System.out.println("Radiusu daxil et");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        var uzunlug = 2 * pi * radius;
        System.out.println(uzunlug);
    }
}
