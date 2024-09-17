package locigLesson2;

public class SumOfOneToTwenty {
    public static void main(String[] args) {
        int saygac = 1;
        int sum = 0;
        while (saygac <= 20) {
            sum = sum + saygac;
            saygac++;
        }
        System.out.println(sum);
    }
}
