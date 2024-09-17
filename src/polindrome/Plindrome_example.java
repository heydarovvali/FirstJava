package polindrome;

import java.util.Scanner;

public class Plindrome_example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozu daxil et");
        String word = scanner.nextLine();

        if (ispolindrome(word)) {
            System.out.println("bu soz polindromdur");
        } else {
            System.out.println("bu soz polindorm deyil");
        }
    }

    public static boolean ispolindrome(String soz) {
        int left = 0;
        int right = soz.length() - 1;
        while (left < right) {
            if (soz.charAt(left) != soz.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
