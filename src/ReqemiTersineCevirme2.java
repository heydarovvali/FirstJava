import java.util.Scanner;

public class ReqemiTersineCevirme2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Sayi daxil edin");
//        int say;
//        int netice;
//        int tersSay = 0;
//        say = scanner.nextInt();
//        while (say != 0) {
//            netice = say % 10;
//            tersSay = tersSay * 10 + netice;
//            say = say / 10;
//        }
//        System.out.println(tersSay);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemi daxil edin");
        int say;
        int netice;
        int tersSay = 0;
        say = scanner.nextInt();
        while (say != 0) {
            netice = say % 10;
            tersSay = tersSay * 10 + netice;
            say = say / 10;
        }
        System.out.println(tersSay);

    }
}
