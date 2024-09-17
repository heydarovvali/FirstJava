package for_while_test;

import java.util.Random;

public class TestTekrar {

    public static void main(String[] args) {

        int max = 0;
        for (int i = 0; i <= 200; i++) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

        System.out.println();

        int a = 1;
        while (a < 100) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }

        System.out.println();

        int max1 = 0;
        int alma[] = new int[30];
        Random rand = new Random();


        for (int i = 0; i < alma.length; i++) {
            alma[i] = rand.nextInt(1, 100);
        }

        for (int i = 0; i < alma.length; i++) {

            if (i > max1) {
                max1 = i;
            }
            System.out.println(max1);

        }


    }

}
