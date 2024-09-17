package locigLesson2;

public class rightStar {
    public static void main(String[] args) {
        int count = 1;
        int maxSimvolSayi = 10;
        while (count <= maxSimvolSayi) {
            int bosluqSayi = maxSimvolSayi - count;
            int bosluqCount = 1;
            while (bosluqCount <= bosluqSayi) {
                System.out.print(" ");
                bosluqCount++;
            }

            int ulduzCount = 1;
            while (ulduzCount <= count) {
                System.out.print("*");
                ulduzCount++;
            }


            System.out.println("");
            count++;
        }
    }
}
