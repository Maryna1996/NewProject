package example.lesson5.polimorfism;

public class DeoMatiz extends Car {

    @Override
    public int getSpeed() {
        System.out.println("DeoMatiz");
        return super.getSpeed();
    }
}
