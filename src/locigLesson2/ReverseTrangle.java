package locigLesson2;

public class ReverseTrangle {
    public static void main(String[] args) {
        int maxSimvolSayi = 9;
        int count = maxSimvolSayi;
        while (count >= 1) {
            int solBosluq = (maxSimvolSayi - count) / 2;
            int solBosluqCount = 1;
            while (solBosluqCount <= solBosluq) {
                System.out.print(" ");
                solBosluqCount++;
            }
            int ulduz = 1;
            while (ulduz <= count) {
                System.out.print("*");
                ulduz++;
            }

            int sagBosluq = (maxSimvolSayi - count) / 2;
            int sagBosluqCount = 1;
            while (sagBosluqCount <= sagBosluq) {
                System.out.print(" ");
                sagBosluqCount++;
            }


            System.out.println("");
            count -= 2;
        }


    }
}
