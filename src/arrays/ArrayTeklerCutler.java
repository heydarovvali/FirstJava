package arrays;

import java.util.Scanner;

public class ArrayTeklerCutler {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scr.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("massivin tek olanlari " + array[i]);
            } else System.out.println("massivin cut olanlari " + array[i]);
        }

    }
}
