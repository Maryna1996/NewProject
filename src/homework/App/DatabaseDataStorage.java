package homework.App;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabaseDataStorage implements DataStorage {
    private final String url;
    private final String user;
    private final String password;
    private String storagePath;

    public DatabaseDataStorage(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.storagePath = "data/";
    }

    @Override
    public void save(String key, Object data) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO data_storage (data_storage.`key`, `data`) VALUES (?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, key);
                statement.setObject(2, data);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object get(String key) {
        String fileName = storagePath + key + ".txt";
        File file = new File(fileName);

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
                return ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            System.err.println("File does not exist: " + fileName);
            return null;
        }

    }

    @Override
    public void delete(String key) {
        String fileName = storagePath + key + ".txt";
        try {
            Files.delete(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String key, Object newData) {
        if (containsKey(key)) {
            save(key, newData);
        }
    }

    @Override
    public boolean containsKey(String key) {
        String fileName = storagePath + key + ".txt";
        return Files.exists(Paths.get(fileName));
    }

    @Override
    public List<String> getAllKeys() {
        try {
            return Files.list(Paths.get(storagePath))
                    .map(path -> path.getFileName().toString().replace(".txt", ""))
                    .toList();
        } catch (IOException e) {
            e.printStackTrace();
            return List.of();
        }
    }

    @Override
    public int size() {
        try {
            return (int) Files.list(Paths.get(storagePath)).count();
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public void clear() {
        try {
            Files.list(Paths.get(storagePath))
                    .forEach(path -> {
                        try {
                            Files.delete(path);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}