package locigLesson2;

public class FactorialOfFive {
    public static void main(String[] args) {
        int number = 5;
        int count = 1;
        int faktorialHasili = 1;
        while (count <= number) {
            faktorialHasili = faktorialHasili * count;  // 1 // 2 //
            if (count != 5) {
                System.out.println(count + " * "); // 1 * 2
            } else {
                System.out.println(count);
            }
            count++;
        }
        System.out.println(" = " + faktorialHasili);
    }
}
