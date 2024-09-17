package locigLesson2;

public class StarTaskFirst {
    public static void main(String[] args) {
        int setir = 4;
        int count = 1;
        while (count <= setir) {
            int deyisenUlduzSayi = 1;
            while (deyisenUlduzSayi <= count) {
                System.out.print("*");
                deyisenUlduzSayi++;
            }

            System.out.println("");
            count++;
        }
    }
}