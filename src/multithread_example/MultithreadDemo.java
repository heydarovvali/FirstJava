package multithread_example;

public class MultithreadDemo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}


