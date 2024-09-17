package homework_calculator;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("a-ni daxil et");
        int a = scan.nextInt();
        System.out.println("b-ni daxil et");
        int b = scan.nextInt();
        System.out.println(sum(a, b));
        System.out.println(subtraction(a, b));
        System.out.println(multiplication(a, b));
        System.out.println(division(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

}









