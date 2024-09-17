package fibonacci;

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayi daxil edin");
        int ilksay = scanner.nextInt();
        System.out.println("ikinci sayi daxil edin");
        int ikincisay = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            int temp = ikincisay;
            ikincisay = ikincisay + ilksay;
            ilksay = temp;
            System.out.println(ikincisay);
        }
    }
}
