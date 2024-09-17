package arrays;

import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {

        int[] array = new int[4];
        array[0] = 13;
        array[1] = 14;
        array[2] = 19;
        array[3] = 20;

        System.out.println(array[3]);

        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[5];
        System.out.println("arrayin elementlerini daxil et");
        array1[0] = scan.nextInt();
        System.out.println("arrays element " + array1[0]);



    }


}
