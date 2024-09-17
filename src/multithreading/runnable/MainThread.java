package multithreading.runnable;

public class MainThread {
    public static void main(String[] args) {

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {


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
            });

            threads[i].start();

        }
    }
}
