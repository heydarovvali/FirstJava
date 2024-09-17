package comple_massiv;

public class MassivEnBoyukEdediTapma {
    public static void main(String[] args) {
        int[] num = {12, 44, 34, 78, 99};
        int enboyuk = 0;
        for (int i = 0; i < num.length; i++) {
            if (enboyuk < num[i]) {
                enboyuk = num[i];
            }
        }
        System.out.println("en boyuk : " + enboyuk);
    }
}
