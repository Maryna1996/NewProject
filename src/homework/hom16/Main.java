package homework.hom16;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a PetrolStation object with an initial amount of fuel of 1000
        PetrolStation petrolStation = new PetrolStation(1000);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit car refueling tasks to the ExecutorService
        executor.submit(() -> {
            // Car 1 refueling logic (doRefuel)
            petrolStation.doRefuel(50); // Replace with the actual amount
        });

        executor.submit(() -> {
            // Car 2 refueling logic (doRefuel)
            petrolStation.doRefuel(30); // Replace with the actual amount
        });

        executor.submit(() -> {
            // Car 3 refueling logic (doRefuel)
            petrolStation.doRefuel(70); // Replace with the actual amount
        });

        // Shutdown the ExecutorService when done
        executor.shutdown();
    }
}
