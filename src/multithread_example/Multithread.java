package multithread_example;

public class Multithread {
    public static void main(String[] args) {

        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadDemo object = new MultithreadDemo();
            object.start();
        }
    }
}
