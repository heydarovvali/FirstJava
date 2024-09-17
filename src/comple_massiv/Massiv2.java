package comple_massiv;

public class Massiv2 {
    public static void main(String[] args) {

        int[] arrays = {12, 25, 45, 7, 8, 18, 6, 49};
        boolean num = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == 45) {
                num = true;
                break;
            }
        }
        if (num) {
            System.out.println(" 45 reqmi var");
        } else {
            System.out.println(" 45 reqemi yoxdur");
        }
    }
}
