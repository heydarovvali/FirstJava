package stream_api_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting3 {
    public static void main(String[] args) {

        List<Integer> num2 = Arrays.asList(5,6,11,4,3);
        List sorting = num2.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting);
        System.out.println("--------------------------");

        Collections.reverse(sorting);
        System.out.println(sorting);
        System.out.println("--------------------------");

        List<Integer> num3 = Arrays.asList(2,4,6,8,10);
        List kv = num2.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(kv);
        System.out.println("--------------------------");

        List<Integer> num4 = Arrays.asList(2,4,6,8,10);
        List kub = num4.stream().map(x -> x*x*x).collect(Collectors.toList());
        System.out.println(kub);
        System.out.println("--------------------------");


        List<String> name1 = Arrays.asList("Farid", "Orxan","Isa","Rza","Anar");
        List say = name1.stream().filter(s -> s.startsWith("F")).collect(Collectors.toList());
        System.out.println(say);
        System.out.println("--------------------------");


        List<Integer> num5 = Arrays.asList(45,12,16,24,17,23);
        List cut = num5.stream().filter(x -> x % 2==0).collect(Collectors.toList());
        System.out.println(cut);

        List<Integer> num6 = Arrays.asList(45,12,16,24,17,23);
        List tek = num6.stream().filter(x -> x % 2 !=0).collect(Collectors.toList());
        System.out.println(tek);

        List<String> ad2 = Arrays.asList("Abbas", "Davud","Isa","Ali");
        List ad = Collections.singletonList(ad2.stream().filter(s ->s.length()<5).count());
        System.out.println(ad);



    }
}













