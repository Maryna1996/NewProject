package example.lesson3.encapsulation;

public class DeoMatiz extends Car {

    @Override
    public int getSpeed() {
        System.out.println("DeoMatiz");
        return super.getSpeed();
    }
}
