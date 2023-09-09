package example.lesson3.associations;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Mykola", false);
        Car car = new Car(passenger);
    }
}
