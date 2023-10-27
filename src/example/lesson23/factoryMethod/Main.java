package example.lesson23.factoryMethod;

public class Main {


    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createStorage(StorageType.IN_MEMORY).store("fdggdffdgdfg");
        factory.createStorage(StorageType.DB).store("4345");
        factory.createStorage(StorageType.FILE).store("34545");
    }
}
