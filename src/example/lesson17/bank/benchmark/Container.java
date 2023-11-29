package example.lesson17.bank.benchmark;

import java.util.List;

public class Container {

    private final List<Object> objectList;

    public Container(List<Object> objectList) {
        this.objectList = objectList;
    }

    public List<Object> getObjectList() {
        return objectList;
    }
}
