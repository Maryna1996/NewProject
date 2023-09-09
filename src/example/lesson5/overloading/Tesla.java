package example.lesson5.overloading;

public class Tesla implements Car {
    @Override
    public void startEngine() {
        System.out.println("Start engine implementaion");
    }

    @Override
    public void startEngine(int initTime) {
        try {
            Thread.sleep(initTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        startEngine();
    }

    @Override
    public void startEngine(int initTime, String notificationMessage) {
        System.out.println(notificationMessage);
        startEngine(initTime);
    }
}
