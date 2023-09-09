package example.lesson3.encapsulation;

public class Car {
    private final static int DEFAULT_SPEED = 60;

    public int getSpeed() {
        return DEFAULT_SPEED;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
