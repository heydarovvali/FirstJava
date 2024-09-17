package string_methods;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Salam Dunya ..";
        System.out.println(s.equals("Salam Dunya"));

        System.out.println(s.length());

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        System.out.println(s.isEmpty()); //bosdurmu?

        System.out.println(s.replace("." ,  ","));

        System.out.println(s.startsWith("S"));

        System.out.println(s.trim()); // ozunden evvelki ve sondaki bosluqlari silir







    }
}
