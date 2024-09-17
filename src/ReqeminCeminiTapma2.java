import java.util.Scanner;

public class ReqeminCeminiTapma2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi daxil edin");
        int n;
        int m;
        int sum = 0;
        n = scanner.nextInt();
        while (n > 0) {
            m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
