package locigLesson;

public class Main {
    public static void main(String[] args) {
        int saygac = 0;
        int sum = 0;
        while (saygac <= 4) {
            sum = sum + saygac;
            System.out.println(sum);
            saygac++;
        }
        System.out.println("");
        System.out.println(sum);
    }
}
