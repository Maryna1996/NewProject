package example.lesson13;

public class Tesla implements Auto{
    @Override
    public int getSpeed() {
        System.out.println("Tesla");
        return 180;
    }
}