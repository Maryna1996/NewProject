package homework.App;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FileDataStorageTest {
    private DataStorage dataStorage;
    private String dataFilePath = "test_data.txt";

    @BeforeEach
    void setUp() {
        dataFilePath = "test_data.txt";
        dataStorage = new FileDataStorage(dataFilePath);
        try {
            Files.createFile(Paths.get(dataFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @AfterEach
    void tearDown() {
        try {
            Files.deleteIfExists(Path.of(dataFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testSaveAndRetrieveData() {
        dataStorage.saveData("key1", "value1");
        dataStorage.saveData("key2", "value2");

        assertEquals("value1", dataStorage.retrieveData("key1"));
        assertEquals("value2", dataStorage.retrieveData("key2"));
    }

    @Test
    void testRetrieveNonExistentData() {
        assertNull(dataStorage.retrieveData("nonexistentKey"));
    }

    @Test
    void testDeleteData() {
        dataStorage.saveData("key1", "value1");
        dataStorage.deleteData("key1");
        assertNull(dataStorage.retrieveData("key1"));
    }

    @Test
    void testUpdateData() {
        dataStorage.saveData("key1", "value1");
        dataStorage.saveData("key1", "value2");

        assertEquals("value2", dataStorage.retrieveData("key1"));
    }
}
