package exception_handling.practice;

public class MainTryCatchFinallyExample {
    public static void main(String[] args) {

        int a = 4;
        int b = 1;
        int[] m = {2, 4};
        try {
            int c = a / b;
            System.out.println(m[1]);
            System.out.println(c);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }
}
