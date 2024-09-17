import java.util.Scanner;

public class EdedinSadeOlmasiniTapma {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Reqemi daxil edin");
//        int number = scanner.nextInt();
//
////        if (number <= 1) {
////            System.out.println("sade eded deyil");
////            return;
////
////        }
//        boolean sade = true;
//        for (int i = 2; i < number; i++) {
//
//            if (number % i == 0) {
//                sade = false;
//                break;
//            }
//        }
//        if (sade) {
//            System.out.println("eded sadedir");
//        } else {
//            System.out.println("eded sade deyil");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("reqemi daxil edin");
        int number = scanner.nextInt();
        boolean reqem = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                reqem = false;
                break;
            }
        }
        if (reqem) {
            System.out.println("Reqem sadedir");
        } else {
            System.out.println("Reqem sade deyil");
        }
    }
}
