package oop;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 8;
        emp1.name = "Vali";
        emp1.surName = "Heydarov";
        emp1.age = 27;
        emp1.phone = "050-536-59-91";
        emp1.address = "Baku";
        emp1.salary = 1234;
        emp1.department = "IT";
        emp1.username = "ValiHeydarov";
        emp1.password = "Heydarov096";

        emp1.printInfo();
    }
}
