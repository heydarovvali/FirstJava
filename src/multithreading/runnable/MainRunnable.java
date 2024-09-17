package multithreading.runnable;

import javax.xml.namespace.QName;

public class MainRunnable {
    public static void main(String[] args) {
        System.out.println("begin");
        MyThread thread1 = new MyThread();
        Thread t1 = new Thread(thread1);
        t1.start();
        System.out.println("end");

    }
}
