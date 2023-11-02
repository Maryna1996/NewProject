package homework.App;

import java.util.List;

public interface DataStorage {
    void save(String key, Object data);
    Object get(String key);
    void delete(String key);

    void update(String key, Object newData);

    boolean containsKey(String key);

    List<String> getAllKeys();

    int size();

    void clear();
}

