package exception_throw_keyword;

public class MainThrowKeyword {
    public static void main(String[] args) {
        System.out.println("main begin");
        int[] myArray = {1, 7, 23, 41};
        int i = 0;
        try {
            i = getValue(myArray, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        System.out.println(i);
        System.out.println("main end");
    }

    public static int getValue(int[] array, int index) {
        if (index >= array.length) {
            System.out.println("Massivin olmayan elementine muraciet etmke olmaz!!");
        }
        System.out.println();
        if (index < 0) {
            System.out.println("Massivin menfi indeksi olmur!!");
        }
        return array[index];
    }
}
