package String_methods_homework;

public class Main {
    public static void main(String[] args) {

        String name = "Cavid";
        System.out.println(name.length());

        System.out.println(name.charAt(1));

        System.out.println(name.indexOf('i'));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        System.out.println(name.concat("g")); // sonuna herf elave etme

        System.out.println(name.endsWith("s"));

        System.out.println(name.startsWith("C"));

        name = "    Adil    ";

        System.out.println(name.trim());

        name = "Bextiyar";

        System.out.println(name.substring(0, 4));

        name = "Eli Hesenov salam necesen ";

        String[] ad = name.split(" ");
        for (String i : ad) {
            System.out.println(i);
        }


    }
}
