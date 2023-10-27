package example.lesson16;

public class Main {


    public static void main(String[] args) throws InterruptedException {
//        Thread myThread = new MyThread();
//        myThread.start();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " index " + i);
            }
        };


        Thread thread = new Thread(runnable);
        thread.start();

        thread.join();

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " index " + i);
        }


    }
}