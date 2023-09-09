package example.lesson5.interfaces;

public class Tesla implements Car{
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void run() {
        Car.switchOnEngine();
        System.out.println("TEsla started to run");
    }
}

