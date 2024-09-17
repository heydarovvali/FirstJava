import javax.swing.plaf.synth.SynthStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class while_example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Reqemi daxil et");
        int sum = 0;
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            sum += array[j];
        }
        System.out.println(sum);

    }
}
