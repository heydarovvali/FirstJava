package massivl_sadeleri_tapma;

import java.util.Random;

public class Replay2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] massiv1 = new int[10];
        for (int i = 0; i < massiv1.length; i++) {
            int y = 1 + random.nextInt(100);
            massiv1[i] = y;
        }
        for (int i : massiv1) {

            boolean sadedir = sadedirmi(i);
            if (sadedir) {
                System.out.println(i + " sade ededdir ");
            }
        }
        System.out.println("main bitdi");
    }

    public static boolean sadedirmi(int eded) {
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
