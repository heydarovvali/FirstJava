package exception_handling_multi_catch;

public class MainExceptionMultiCatch {
    public static void main(String[] args) {

        int a = 4;
        int b = 0;
        int[] m = {2, 4};
        try {
            int c = a / b;
            System.out.println(m[7]);
            System.out.println(c);
            String s = null;
            System.out.println(s.length());


        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());

        } catch (RuntimeException e) { // hec biri tutmasa bu tutacaq
            System.out.println("RuntimeException");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }
}

