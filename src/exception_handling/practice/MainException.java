package exception_handling.practice;

public class MainException {
    public static void main(String[] args) {

        System.out.println("main begin");
        int a = 4;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exc) {
            System.out.println(exc.getMessage()); //exc.printStackTrace - de yazmaq olar, bele oldugu halda daha detalli melumat almaq olar
        }
        System.out.println("main end");
    }
}
