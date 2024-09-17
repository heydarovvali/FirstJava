package home_work_14_computer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Computer hp = new Computer();
        hp.setId(1);
        hp.setModel("pavilion");
        hp.setRam(8);

        Computer asus = new Computer();
        asus.setId(2);
        asus.setModel("Tuf");
        asus.setRam(12);

        Computer acer = new Computer();
        acer.setId(3);
        acer.setModel("Predator");
        acer.setRam(7);

        ArrayList<Computer> computerList = new ArrayList<Computer>();
        computerList.add(hp);
        computerList.add(asus);
        computerList.add(acer);

        System.out.println(computerList);

        Collections.sort(computerList, Comparator.comparingInt(computer -> computer.getRam()));
        System.out.println(computerList);
    }
}
