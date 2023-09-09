package example.lesson3.encapsulation;

public class Policeman {
    private final static int MAX_ACCESS_SPEED = 130;

    private Car car;

    public void checkSpeed() {
        final int currentSpeed = car.getSpeed();
        useRadar(currentSpeed);
        if (currentSpeed > MAX_ACCESS_SPEED) {
            stopCar();
        }
    }

    private void useRadar(int speed) {
        System.out.println("Current speed is " + speed + " km/h");
    }


    private void stopCar() {
        System.out.println("Policemen is trying to stop the car...");
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
