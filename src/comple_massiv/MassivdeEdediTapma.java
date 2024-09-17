package comple_massiv;

public class MassivdeEdediTapma {
    public static void main(String[] args) {
        int[] massiv = {12, 52, 44, 66, 95};
        boolean num = false;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 12) {
                num = true;
                break;
            }
        }
        if (num) {
            System.out.println("bu reqem movcuddur");
        } else {
            System.out.println("bu reqem movcud deyil");
        }
    }
}
