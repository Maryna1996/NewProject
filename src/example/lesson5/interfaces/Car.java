package example.lesson5.interfaces;

public interface Car extends Vehicle {

    int DEFAULT_SPEED = 60;

    int getSpeed();

    static void switchOnEngine() {
        System.out.println("Engine is switching on...");
    }
}