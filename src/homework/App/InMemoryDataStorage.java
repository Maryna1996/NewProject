package homework.App;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryDataStorage implements DataStorage {
    private final Map<String, String> data = new HashMap<>();

    @Override
    public void saveData(String key, String value) {
        data.put(key, value);
    }

    @Override
    public void saveData(String data) {

    }

    @Override
    public String retrieveData(String key) {
        return data.get(key);
    }

    @Override
    public void deleteData(String key) {
        data.remove(key);
    }

    @Override
    public String retrieveData() {
        return null;
    }

    @Override
    public void save(String key, Object data) {

    }

    @Override
    public Object get(String key) {
        return null;
    }

    @Override
    public void delete(String key) {

    }

    @Override
    public void update(String key, Object newData) {

    }

    @Override
    public boolean containsKey(String key) {
        return false;
    }

    @Override
    public List<String> getAllKeys() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void resetDatabase() {
    }
}
