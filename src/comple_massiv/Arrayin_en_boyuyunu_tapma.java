package comple_massiv;

public class Arrayin_en_boyuyunu_tapma {
    public static void main(String[] args) {
        int[] array = {12, 74, 85, 99,111};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
    }
}
