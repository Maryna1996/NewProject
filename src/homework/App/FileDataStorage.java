package homework.App;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileDataStorage implements DataStorage {
    private String storagePath = "data/";

    @Override
    public void save(String key, Object data) {
        String fileName = storagePath + key + ".txt";
        try {
            new File(storagePath).mkdirs();
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
                oos.writeObject(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Object get(String key) {
        String fileName = storagePath + key + ".txt";
        File file = new File(fileName);

        if (!file.exists()) {
            System.err.println("File does not exist: " + fileName);
            return null;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
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

