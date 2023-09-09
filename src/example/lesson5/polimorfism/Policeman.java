package example.lesson5.polimorfism;

import java.util.List;

public class Policeman {
    private final static int MAX_ACCESS_SPEED = 130;

    private List<Car> cars;

    public void checkSpeed() {
        for (Car car : cars) {
            final int currentSpeed = car.getSpeed();
            useRadar(currentSpeed);
            if (currentSpeed > MAX_ACCESS_SPEED) {
                stopCar();
            }
        }
    }

    private void useRadar(int speed) {
        System.out.println("Current speed is " + speed + " km/h");
    }


    private void stopCar() {
        System.out.println("Policemen is trying to stop the car...");
    }

    public void setCar(List<Car> cars) {
        this.cars = cars;
    }
}
