package encapsulation_example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student person = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.println("adi daxil edin");
        String name = scan.next();
        person.setName(name);
        System.out.println("soyadi daxil et");
        String surname = scan.next();
        person.setSurName(surname);
        System.out.println("yashi daxil edin");
        String ageStr = scan.next();
        int age = Integer.parseInt(ageStr);
        person.setAge(age);

        System.out.println(person.getName());
        System.out.println(person.getSurName());
        System.out.println(person.getAge());


    }
}
