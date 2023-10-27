package example.lesson13;

public class Toyota implements Auto{
    @Override
    public int getSpeed() {
        System.out.println("Toyota");
        return 120;
    }
}
