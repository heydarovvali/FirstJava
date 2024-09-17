package exception_throw_keyword;

public class Replay {
    public static void main(String[] args) {
        System.out.println("Main begin");
        int[] myArray = {41, 12, 2, 5, 36};
        int i = 0;
        try {
            i = getValue(myArray, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
        System.out.println(i);
        System.out.println("Main end");
    }

    public static int getValue(int[] array, int index) {
        if (index >= array.length) {
            System.out.println("Massivin olmayan elementine muraciet etmek olmaz");
        }
        System.out.println();
        if (index < 0) {
            System.out.println("Massivin menfi elementi olmur");
        }
        return array[index];
    }
}
