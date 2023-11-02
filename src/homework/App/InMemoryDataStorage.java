package homework.App;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryDataStorage implements DataStorage {
    private final Map<String, Object> dataStore = new ConcurrentHashMap<>();

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
        if (dataStore.containsKey(key)) {
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

