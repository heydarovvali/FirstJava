package locigLesson2;

public class TrangleTask {
    public static void main(String[] args) {
        int maxSimvolSayi = 9;
        int count = 1;
        while (maxSimvolSayi - count >= 0) {
            int solBosluqSayi = (maxSimvolSayi - count) / 2;
            int solBosluqCount = 1;
            while (solBosluqCount <= solBosluqSayi) {
                System.out.print(" ");
                solBosluqCount++;


            }
            int ulduzCount = 1;
            while (ulduzCount <= count) {
                System.out.print("*");
                ulduzCount++;
            }


            int sagBosluqSayi = (maxSimvolSayi - count) / 2;
            int sagBosluqCount = 1;
            while (sagBosluqCount <= sagBosluqSayi) {
                System.out.print(" ");
                sagBosluqCount++;
            }

            System.out.println("");
            count += 2;
        }
    }
}
