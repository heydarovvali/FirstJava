package exception;

public class Exception_example {

    public static void main(String[] args) {

        try {

            int[] ary = new int[10];
            ary[1] = 5;
            ary[2] = 10;
            System.out.println(ary[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Limiti asdin");

            System.out.println();
        }


        System.out.println("salam");

        System.out.println();

        try {
            int a = 8;
            int b = 0;
            int d = a / b;
            System.out.println(d);

        } catch (ArithmeticException r) {

            System.out.println("0-a bolme yoxdur");
        }
        System.out.println();

        try {
            String name = "";
            if (name.equals("Vali")) {
                System.out.println("duzdur");
            } else System.out.println("sefdir");
            System.out.println(name);
        } catch (NullPointerException t) {
            System.out.println("deyer yoxdur");
        }
    }
}
