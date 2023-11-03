package homework.App;

import java.util.List;

interface DataStorage {
    void saveData(String key, String value);

    void saveData(String data);

    String retrieveData(String key);
    void deleteData(String key);

    String retrieveData();

    void save(String key, Object data);

    Object get(String key);

    void delete(String key);

    void update(String key, Object newData);

    boolean containsKey(String key);

    List<String> getAllKeys();

    int size();

    void clear();

    void resetDatabase();
}

