package locigLesson;

public class LoopPractics {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number <= 100) {
            sum = number + sum;
            number++;
        }
        System.out.println("toplam cem " + sum);
    }
}
