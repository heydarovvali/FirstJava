package stream_api_example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 4, 16, 12, 23);
        List sorting = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting);
        System.out.println("---------------------------");

        Collections.reverse(sorting);
        System.out.println(sorting);
        System.out.println("---------------------------");


        List<Integer> kub = Arrays.asList(1, 2, 3, 4, 5, 6);
        List kubtapma = kub.stream().map(x -> x * x * x).collect(Collectors.toList());
        System.out.println(kubtapma);

        List<Integer> kv = Arrays.asList(1, 2, 3, 4, 5, 6);
        List kvtapma = kv.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(kvtapma);

        List<String> names = Arrays.asList("Resul", "Resad", "Rustem", "Orxan", "Vuqar");
        List typ = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(typ);

        List<Integer> numbers2 = Arrays.asList(12, 5, 8, 36, 7, 13, 66);
        List cut = numbers2.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(cut);

        List<Integer> numbers3 = Arrays.asList(12, 5, 8, 36, 7, 13, 66);
        List tek = numbers2.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(tek);

        List<String> names3 = Arrays.asList("Orxan" ,"Resul", "Ali", "Vuqar","Rza");
        List num = Collections.singletonList(names3.stream().filter(s -> s.length() < 5).collect(Collectors.toList()));
        System.out.println(num);

        List<String> names4 = Arrays.asList("Orxan" ,"Resul", "Ali", "Vuqar","Rza");
        List num2 = Collections.singletonList(names3.stream().filter(s -> s.length() < 5).count());
        System.out.println(num2);

    }

}
