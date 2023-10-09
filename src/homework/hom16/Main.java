package homework.hom16;

public class Main {
    public static void main(String[] args) {
        // Create a PetrolStation object with an initial amount of fuel of 1000
        PetrolStation petrolStation = new PetrolStation(1000);

        // Create a list to store refueling requests
        ThreadSafeList<Integer> refuelRequests = new ThreadSafeList<>();

        // Create three threads that try to refuel cars
        Thread car1 = new Thread(() -> {
            int fuelAmount = 50;
            petrolStation.doRefuel(fuelAmount);
        });

        Thread car2 = new Thread(() -> {
            int fuelAmount = 30;
            petrolStation.doRefuel(fuelAmount);
        });

        Thread car3 = new Thread(() -> {
            int fuelAmount = 70;
            petrolStation.doRefuel(fuelAmount);
        });

        car1.start();
        car2.start();
        car3.start();

        // Waiting for threads to finish
        try {
            car1.join();
            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // We get the amount of remaining fuel at the gas station
        int remainingFuel = petrolStation.getAmount();
        System.out.println("Remaining fuel at the station:" + remainingFuel);
    }
}
