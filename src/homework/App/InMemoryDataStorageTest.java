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
        dataStorage.saveData("John", "123-456-7890");
        dataStorage.saveData("Alice", "987-654-3210");

        assertEquals("123-456-7890", dataStorage.retrieveData("John"));
        assertEquals("987-654-3210", dataStorage.retrieveData("Alice"));
    }

    @Test
    void testRetrieveNonExistentContact() {
        assertNull(dataStorage.retrieveData("Bob"));
    }

    @Test
    void testDeleteContact() {
        dataStorage.saveData("Eve", "555-123-4567");
        dataStorage.deleteData("Eve");
        assertNull(dataStorage.retrieveData("Eve"));
    }

    @Test
    void testSaveAndRetrieveMultipleValues() {
        dataStorage.saveData("Charlie", "111-222-3333");
        dataStorage.saveData("David", "444-555-6666");

        assertEquals("111-222-3333", dataStorage.retrieveData("Charlie"));
        assertEquals("444-555-6666", dataStorage.retrieveData("David"));
    }

    @Test
    void testUpdateContact() {
        dataStorage.saveData("Eve", "555-123-4567");
        dataStorage.saveData("Eve", "777-888-9999");

        assertEquals("777-888-9999", dataStorage.retrieveData("Eve"));
    }
}

