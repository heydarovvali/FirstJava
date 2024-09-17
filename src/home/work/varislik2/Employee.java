package home.work.varislik2;

public class Employee extends Person {

    int salary;
    String department;
    String username;
    int password;


    public void printInfo(Person p) {
       p.printInfo();
        System.out.println(salary);
        System.out.println(department);
        System.out.println(username);
        System.out.println(password);
    }

}
