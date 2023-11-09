package homework.App;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseDataStorage implements DataStorage {
    private Map<String, String> database = new HashMap<>();

    @Override
    public void saveData(String key, String value) {
        database.put(key, value);
    }

    @Override
    public void saveData(String data) {
    }

    @Override
    public String retrieveData(String key) {
        return database.get(key);
    }

    @Override
    public void deleteData(String key) {
        database.remove(key);
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
        return database.containsKey(key);
    }

    @Override
    public List<String> getAllKeys() {
        return List.copyOf(database.keySet());
    }

    @Override
    public int size() {
        return database.size();
    }

    @Override
    public void clear() {
        database.clear();
    }

    @Override
    public void resetDatabase() {
        database.clear();
    }
}