package example.lesson23.factoryMethod;


public class DBStorage implements DataStorage {
    @Override
    public void store(String data) {
        System.out.println("DB Storage "+data);
    }
}
