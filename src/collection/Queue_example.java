package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_example {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("iphone");
        queue.add("samsung");
        queue.add("LG");
        queue.add("Honor");
        queue.add("Nokia");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        System.out.println("Alls " + queue);
    }
}
