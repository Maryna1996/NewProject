package homework.App;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class FileDataStorage implements DataStorage {
    private String dataFilePath;

    public FileDataStorage(String dataFilePath) {
        this.dataFilePath = dataFilePath;
    }

    @Override
    public void saveData(String key, String value) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(dataFilePath));
            List<String> updatedLines = new ArrayList<>();
            boolean found = false;

            for (String line : lines) {
                if (line.startsWith(key + "=")) {
                    updatedLines.add(key + "=" + value);
                    found = true;
                } else {
                    updatedLines.add(line);
                }
            }

            if (!found) {
                updatedLines.add(key + "=" + value);
            }

            Files.write(Paths.get(dataFilePath), updatedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData(String data) {
        try (FileWriter fileWriter = new FileWriter(dataFilePath, true);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String retrieveData(String key) {
        try {
            return Files.lines(Path.of(dataFilePath))
                    .filter(line -> line.startsWith(key + "="))
                    .map(line -> line.split("=")[1])
                    .findFirst()
                    .orElse(null);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteData(String key) {
        try {
            List<String> lines = Files.readAllLines(Path.of(dataFilePath));
            List<String> updatedLines = new ArrayList<>();
            for (String line : lines) {
                if (!line.startsWith(key + "=")) {
                    updatedLines.add(line);
                }
            }
            Files.write(Path.of(dataFilePath), updatedLines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String retrieveData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(dataFilePath))) {
            StringBuilder data = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
            return data.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(String key, Object data) {
        // Реалізація збереження об'єкта за ключем
    }

    @Override
    public Object get(String key) {
        // Реалізація отримання об'єкта за ключем
        return null;
    }

    @Override
    public void delete(String key) {
        // Реалізація видалення об'єкта за ключем
    }

    @Override
    public void update(String key, Object newData) {
        // Реалізація оновлення об'єкта за ключем
    }

    @Override
    public boolean containsKey(String key) {
        // Реалізація перевірки наявності ключа
        return false;
    }

    @Override
    public List<String> getAllKeys() {
        // Реалізація отримання всіх ключів
        return null;
    }

    @Override
    public int size() {
        // Реалізація отримання кількості елементів
        return 0;
    }

    @Override
    public void clear() {
        // Реалізація очищення сховища даних
    }

    @Override
    public void resetDatabase() {
        // Реалізація скидання бази даних
    }
}