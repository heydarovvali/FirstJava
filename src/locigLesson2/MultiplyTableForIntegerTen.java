package locigLesson2;

public class MultiplyTableForIntegerTen {
    public static void main(String[] args) {
        int number = 14;
        int count = 1;
        while (count <= 10) {
            System.out.println(number + " * " + count + " = " + (number * count));
            count++;
        }
    }
}
