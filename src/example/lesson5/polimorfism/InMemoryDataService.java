package example.lesson5.polimorfism;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataService implements DataService{


    private  List<String> strings = new ArrayList<>();
    @Override
    public void storeData(String data) {
        strings.add(data);
    }

    @Override
    public String getData() {
        return null;
    }
}
