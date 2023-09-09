package example.lesson5.abstraction;

public abstract class Car {

    public static final int DEFAULT_SPEED = 60;

    public Car() {
        System.out.println("The current speed is " + getSpeed() + " km/h");
    }

    abstract int getSpeed();
}
