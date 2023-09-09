package example.lesson5.polimorfism;

public class Toyota extends Car{

    @Override
    public int getSpeed() {
        System.out.println("Toyota");
        return 120;
    }
}

