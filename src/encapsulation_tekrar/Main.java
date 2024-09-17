package encapsulation_tekrar;

public class Main {
    public static void main(String[] args) {

        Student vali = new Student();
        vali.setName("Vali");
        System.out.println(vali.getName());

        vali.setSurName("Heydarov");
        System.out.println(vali.getSurName());

        vali.setAge(27);
        System.out.println(vali.getAge());

        vali.setPhoneNumber("050-600-40-03");
        System.out.println(vali.getPhoneNumber());

        vali.setAddress("Baku");
        System.out.println(vali.getAddress());

        vali.prit();


    }
}
