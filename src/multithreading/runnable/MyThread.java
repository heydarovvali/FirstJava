package multithreading.runnable;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 40; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
