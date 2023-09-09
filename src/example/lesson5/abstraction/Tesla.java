package example.lesson5.abstraction;

public class Tesla extends Car{
    @Override
    int getSpeed() {
        System.out.println("Tesla");
        return 130;
    }
}
