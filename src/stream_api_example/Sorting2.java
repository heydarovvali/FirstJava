package stream_api_example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting2 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(12, 45, 7, 23, 9, 16);
        List sorting = num.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting);
        System.out.println("-------------------------");

        Collections.reverse(sorting);
        System.out.println(sorting);
        System.out.println("-------------------------");


        List<Integer> num2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List kub = num2.stream().map(x -> x * x * x).collect(Collectors.toList());
        System.out.println(kub);
        System.out.println("-------------------------");

        List<Integer> num3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List kv = num3.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(kv);
        System.out.println("-------------------------");

        List<String> name = Arrays.asList("Ramal", "Resul", "Anar", "Samir", "Ali");
        List typ = name.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(typ);
        System.out.println("-------------------------");

        List<Integer> say = Arrays.asList(14, 45, 2, 7, 13, 96);
        List cut = say.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(cut);
        System.out.println("-------------------------");

        List<Integer> say2 = Arrays.asList(14, 45, 2, 7, 13, 96);
        List tek = say.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(tek);

        List<String> name2 = Arrays.asList("Abbas", "Rza","Perviz","Veli","Heydar");
        List ad2 = Collections.singletonList(name2.stream().filter(s->s.length()<5).count());
        System.out.println(ad2);
        System.out.println("-------------------------");

        List<String> name3 = Arrays.asList("Abbas", "Rza","Perviz","Veli","Heydar");
        List ad3 = Collections.singletonList(name2.stream().filter(s->s.length()<5).collect(Collectors.toList()));
        System.out.println(ad3);
    }
}
