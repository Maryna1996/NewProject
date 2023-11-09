package TestApp;

import homework.App.DataStorage;
import homework.App.DatabaseDataStorage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;


class DatabaseDataStorageTest {
    private DataStorage dataStorage;

    @BeforeEach
    void setUp() {
        dataStorage = new DatabaseDataStorage();
    }

    @AfterEach
    void tearDown() {
        dataStorage.resetDatabase();
    }

    @Test
    void testSaveAndRetrieveContact() {
        dataStorage.saveData("John", "123-456-7890");
        dataStorage.saveData("Alice", "987-654-3210");

        Assertions.assertEquals("123-456-7890", dataStorage.retrieveData("John"));
        Assertions.assertEquals("987-654-3210", dataStorage.retrieveData("Alice"));
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
    void testUpdateContact() {
        dataStorage.saveData("Charlie", "111-222-3333");
        dataStorage.saveData("Charlie", "444-555-6666");

        Assertions.assertEquals("444-555-6666", dataStorage.retrieveData("Charlie"));
    }
}
