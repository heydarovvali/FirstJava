package home_work_14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person vali = new Person();
        vali.setName("Vali");
        vali.setSurName("Heydarov");
        vali.setAge(27);

        Person hesen = new Person();
        hesen.setName("Hesen");
        hesen.setSurName("Aliyev");
        hesen.setAge(26);

        Person nicat = new Person();
        nicat.setName("Nicat");
        nicat.setSurName("Rzayev");
        nicat.setAge(26);

        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(vali);
        personList.add(hesen);
        personList.add(nicat);
        System.out.println(personList);

    }
}
