package homework.App;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class InMemoryDataStorageTest {
    private DataStorage dataStorage;

    @BeforeEach
    void setUp() {
        dataStorage = new InMemoryDataStorage();
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
    void testSaveAndRetrieveMultipleValues() {
        dataStorage.saveData("key1", "value1");
        dataStorage.saveData("key2", "value2");

        assertEquals("value1", dataStorage.retrieveData("key1"));
        assertEquals("value2", dataStorage.retrieveData("key2"));
    }

    @Test
    void testUpdateData() {
        dataStorage.saveData("key1", "value1");
        dataStorage.saveData("key1", "value2");

        assertEquals("value2", dataStorage.retrieveData("key1"));
    }
}


