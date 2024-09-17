package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_example2 {
    public static void main(String[] args) {
        Queue<String> queue2 = new LinkedList<>();
        queue2.add("vali");
        queue2.add("samed");
        queue2.add("ali");
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());




    }
}
