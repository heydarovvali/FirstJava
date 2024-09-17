import java.util.Scanner;

public class FaktorialTapma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemi daxil edin");
        int a = scanner.nextInt();
        int vurma = 1;
        for (int i = 1; i <= a; i++) {
            vurma = vurma * i;
        }
        System.out.println("cavab = " + vurma);

    }
}
