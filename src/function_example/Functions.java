package function_example;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("a-value");
        double a = scan.nextDouble();
        System.out.println("b-value");
        double b = scan.nextDouble();
        System.out.println("c-value");
        double c = scan.nextDouble();
        System.out.println(values(a, b, c));

    }

    public static double values(double a, double b, double c) {
        return a + b - c;

    }
}
