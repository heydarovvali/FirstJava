package array_list;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("puma");
        list.add("adidas");
        list.add("the north face");
        list.add("nike");

        list.remove(0);

        System.out.println(list);
    }
}
