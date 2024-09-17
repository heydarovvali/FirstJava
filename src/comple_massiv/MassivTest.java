package comple_massiv;

public class MassivTest {
    public static void main(String[] args) {

        int[] nubmers = {12, 6, 7, 65, 33, 20};
        int sum = 0;
        for (int i = 0; i < nubmers.length; i++) {
            sum = sum + nubmers[i];
        }
        System.out.println("Reqemlerin cemi " + sum);
        for (int numbers : nubmers) {
            System.out.println(numbers);
        }
        double edediorta = sum / nubmers.length;
        System.out.println("ededi ortasi " + edediorta);

        int enkicik = nubmers[0];
        for (int i = 0; i < nubmers.length; i++) {

            if (nubmers[i] < enkicik)
                enkicik = nubmers[i];
        }
        System.out.println("enkicik " + enkicik);
        int enboyuk = nubmers[0];
        for (int i = 0; i <nubmers.length ; i++) {
            if (nubmers[i]>enboyuk)
                enboyuk = nubmers[i];
        }
        System.out.println("enboyuk " + enboyuk);
    }
}
