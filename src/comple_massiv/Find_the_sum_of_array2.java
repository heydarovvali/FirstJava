package comple_massiv;

import java.awt.*;
import java.util.Scanner;

public class Find_the_sum_of_array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massivin uzunlugunu daxil edin");
        int m = scanner.nextInt();
        int[] massiv = new int[m];
        System.out.println("Reqemleri daxil edin");
        for (int i = 0; i < m; i++) {
            massiv[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum + massiv[i];
        }
        System.out.println(sum);
    }
}

