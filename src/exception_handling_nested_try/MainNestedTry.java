package exception_handling_nested_try;

public class MainNestedTry {
    public static void main(String[] args) {

        try {
            try {
                int a = 3 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
            int[] m = {5, 6};
            System.out.println(m[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
