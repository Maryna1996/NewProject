package example.lesson23.observer;

public class MobilePushChannel implements Channel {
    @Override
    public void update(String event) {
        System.out.println("Mobile push channel got event: " + event);

    }
}
