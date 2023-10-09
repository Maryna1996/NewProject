package homework.hom16;

import java.util.concurrent.locks.ReentrantLock;

public class PetrolStation {
    private int amount;
    private final ReentrantLock lock = new ReentrantLock();

    public PetrolStation(int initialAmount) {
        this.amount = initialAmount;
    }

    public void doRefuel(int fuelAmount) {
        try {
            lock.lock();
            if (fuelAmount <= 0 || fuelAmount > amount) {
                System.out.println("Error: Insufficient fuel or incorrect amount of fuel");
                return;
            }

            // Simulation of refueling time (from 3 to 10 seconds)
            long refuelTime = (long) (Math.random() * 8000) + 3000;
            Thread.sleep(refuelTime);

            amount -= fuelAmount;
            System.out.println("Refueling is completed. Fuel left: " + amount);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public int getAmount() {
        return amount;
    }
}
