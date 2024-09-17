import java.util.Scanner;

public class ReqemiTersineCevirme {
    public static void main(String[] args) {

        int say = 123;
        int tersSay = 0;
        int reqem;
        while (say != 0) {
            reqem = say % 10;
            tersSay = tersSay * 10 + reqem;
            say = say / 10;

        }
        System.out.println(tersSay);

    }
}
