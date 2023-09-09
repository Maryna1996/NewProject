package example.lesson5.abstraction;

public class Deo extends Car{
    @Override
    int getSpeed() {
        System.out.println("DEO");
        return Car.DEFAULT_SPEED;
    }
}
