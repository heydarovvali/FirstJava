package stream_api_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting6 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(7, 25, 8, 12, 5, 3);
        List sorting = number.stream().sorted().collect(Collectors.toList());
        System.out.println(sorting);
        System.out.println("1--------------------------");

        Collections.reverse(sorting);
        System.out.println(sorting);
        System.out.println("2--------------------------");

        List<Integer> kub = Arrays.asList(3, 4, 5, 6, 7);
        List kubTapma = kub.stream().map(x -> x * x * x).collect(Collectors.toList());
        System.out.println(kubTapma);
        System.out.println("3--------------------------");

        List<Integer> kvTapma = Arrays.asList(2, 4, 7, 11, 9);
        List kv = kvTapma.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(kv);
        System.out.println("4--------------------------");

        List<Integer> num = Arrays.asList(74, 25, 12, 16, 17);
        List nums = num.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(nums);
        System.out.println("5--------------------------");

        List<Integer> nums1 = Arrays.asList(74, 25, 12, 16, 17);
        List nums2 = nums1.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(nums2);
        System.out.println("6--------------------------");

        List<String> name = Arrays.asList("Ramal", "Rasul", "Ali", "Rza", "Tural");
        List starvish = name.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
        System.out.println(starvish);
        System.out.println("7--------------------------");

        List<String> name2 = Arrays.asList("Aladdin", "Karim", "Camal", "Turan", "Mahammad");
        List lenght = Collections.singletonList(name2.stream().filter(s -> s.length() < 8).collect(Collectors.toList()));
        System.out.println(lenght);
        System.out.println("8--------------------------");

    }
}
