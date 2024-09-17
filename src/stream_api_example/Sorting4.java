package stream_api_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting4 {
    public static void main(String[] args) {

        List<Integer> sort = Arrays.asList(12, 74, 85, 9, 19);
        List sorting = sort.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting);
        System.out.println("--------------------------");

        Collections.reverse(sorting);
        System.out.println(sorting);
        System.out.println("--------------------------");

        List<Integer> kub = Arrays.asList(4, 8, 9, 3, 2);
        List kubTapma = kub.stream().map(x -> x * x * x).collect(Collectors.toList());
        System.out.println(kubTapma);
        System.out.println("--------------------------");

        List<Integer> kv = Arrays.asList(2, 4, 5, 8, 9);
        List kvTapma = kv.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(kvTapma);
        System.out.println("--------------------------");

        List<Integer> num = Arrays.asList(12, 74, 85, 26, 44, 17);
        List cut = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(cut);
        System.out.println("--------------------------");

        List<Integer> num2 = Arrays.asList(12, 74, 85, 26, 44, 17);
        List tek = num2.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(tek);
        System.out.println("--------------------------");

        List<String> names = Arrays.asList("Anar", "Tural", "Samir", "Abbas", "Rza", "Yusif", "Ali");
        List starvish = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(starvish);
        System.out.println("--------------------------");

        List<String> names2 = Arrays.asList("Anar", "Tural", "Samir", "Abbas", "Rza", "Yusif", "Ali");
        List lenght = Collections.singletonList(names2.stream().filter(s -> s.length() < 5).collect(Collectors.toList()));
        System.out.println(lenght);
        System.out.println("--------------------------");


    }
}
