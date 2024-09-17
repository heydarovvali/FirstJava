package polindrome;

import java.util.Scanner;

public class polidrome2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sozu daxil edin");
        String word = scanner.nextLine();
        if (polindrome(word)){
            System.out.println("bu soz polindrom-dur");
        }else {
            System.out.println("Polindrom deyil");
        }
    }

    public static boolean polindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}




