import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Radiusu daxil et");
        double radius = scan.nextDouble();
        double pi = 3.14;
        double uzunlug = 2 * pi * radius;
        System.out.println("cevrenin uzunlugu = " + uzunlug);
    }
}
