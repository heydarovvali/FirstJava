package array_tekrar;

import java.util.Random;

public class ArrayTekrar {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(1, 100);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Tekler " + array[i]);
            } else System.out.println("Cutler " + array[i]);
        }

    }
}
