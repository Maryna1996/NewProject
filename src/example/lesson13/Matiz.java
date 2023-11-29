package example.lesson13;

public class Matiz implements Auto{
    @Override
    public int getSpeed() {
        System.out.println("Matiz");
        return 60;
    }
}
