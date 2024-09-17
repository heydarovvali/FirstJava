package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 1; i <= 30; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
