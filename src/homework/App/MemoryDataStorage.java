package homework.App;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryDataStorage implements DataStorage {
    private Map<String, Object> dataStore = new HashMap<>();

    @Override
    public void save(String key, Object data) {
        dataStore.put(key, data);
    }

    @Override
    public Object get(String key) {
        return dataStore.get(key);
    }

    @Override
    public void delete(String key) {
        dataStore.remove(key);
    }

    @Override
    public void update(String key, Object newData) {
        if (containsKey(key)) {
            dataStore.put(key, newData);
        }
    }

    @Override
    public boolean containsKey(String key) {
        return dataStore.containsKey(key);
    }

    @Override
    public List<String> getAllKeys() {
        return new ArrayList<>(dataStore.keySet());
    }

    @Override
    public int size() {
        return dataStore.size();
    }

    @Override
    public void clear() {
        dataStore.clear();
    }
}
