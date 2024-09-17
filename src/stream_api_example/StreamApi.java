package stream_api_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("BMW");
        name.add("Mercedes");
        name.add("Audi");
        System.out.println(name);

        List<String> name2 = Arrays.asList("BMW", "Mercedes", "Audi");
        System.out.println(name2);

        List<Integer> number = new ArrayList<>();
        number.add(11);
        number.add(12);
        number.add(13);
        System.out.println(number);

        List<Integer> number2 = Arrays.asList(11, 12, 13);
        System.out.println(number2);
    }
}
