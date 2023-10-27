package example.lesson23.observer;

public class EmailChannel implements Channel {
    @Override
    public void update(String event) {
        System.out.println("Email channel got event: " + event);
    }
}
