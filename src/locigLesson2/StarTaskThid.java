package locigLesson2;

public class StarTaskThid {
    public static void main(String[] args) {
        int setir = 4;
        int count = 1;
        int maxUlduzSayi = 10;
        while (count <= setir) {
            int deyisenUlduzSayi = 1;
            while (deyisenUlduzSayi <= maxUlduzSayi) {
                System.out.print("*");
                deyisenUlduzSayi++;
            }

            System.out.println("");
            count++;
        }
    }
}
