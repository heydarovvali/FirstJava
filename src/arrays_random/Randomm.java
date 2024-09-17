package arrays_random;


import com.sun.security.jgss.GSSUtil;

import java.util.Random;

public class Randomm {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 50);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
