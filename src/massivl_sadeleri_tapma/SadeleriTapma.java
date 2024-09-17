package massivl_sadeleri_tapma;

import java.util.Random;

public class SadeleriTapma {
    public static void main(String[] args) {

        Random random = new Random();
        int[] massiv = new int[50];
        for (int i = 0; i < massiv.length; i++) {
            int t = 1 + random.nextInt(100);
            massiv[i] = t;
        }
        for (int i:massiv) {
            boolean sadedir = sadedirmi(i);
            if (sadedir) {
                System.out.println(i + " = sade ededdir");
            }
        }
        System.out.println("main bitdi");
    }

    static boolean sadedirmi(int eded) {
        boolean murekkebdir = false;
        for (int i = 2; i <= eded - 1; i++) {
            if (eded % i == 0) {
                murekkebdir = true;
                break;
            }
        }
        return !murekkebdir;
    }
}
