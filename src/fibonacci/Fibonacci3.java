package fibonacci;

import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("reqem daxil edin : ");
        int input = scanner.nextInt();

        int s1 = 0;
        int s2 = 1;
        int cem;
        System.out.print(input + " reqeminin fibonacci neticesi :");
        for (int i = 1; i <= input; i++) {
            System.out.print(s1 + " , ");
            cem = s1 + s2;
            s1 = s2;
            s2 = cem;
        }
    }
}
