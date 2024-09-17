package multithreading.with_name;

public class MainThreadWithName {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread 1");
        Thread t1= new Thread(thread1);
        t1.start();

        MyThread thread2 = new MyThread("Thread 2");
        Thread t2= new Thread(thread2);
        t2.start();

    }
}
