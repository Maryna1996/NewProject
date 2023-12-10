//package homework.App;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//class FileDataStorageTest {
//    private DataStorage dataStorage;
//    private String dataFilePath = "test_data.txt";
//
//
//    @BeforeEach
//    void setUp() {
//        dataFilePath = "test_data.txt";
//        dataStorage = new FileDataStorage(dataFilePath);
//        try {
//            Files.createFile(Paths.get(dataFilePath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @AfterEach
//    void tearDown() {
//        try {
//            Files.deleteIfExists(Path.of(dataFilePath));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    void testSaveAndRetrieveData() {
//        dataStorage.saveData("product1", "10.99 USD");
//        dataStorage.saveData("product2", "5.99 USD");
//
//        assertEquals("10.99 USD", dataStorage.retrieveData("product1"));
//        assertEquals("5.99 USD", dataStorage.retrieveData("product2"));
//    }
//
//    @Test
//    void testRetrieveNonExistentData() {
//        assertNull(dataStorage.retrieveData("nonexistentProduct"));
//    }
//
//    @Test
//    void testDeleteData() {
//        dataStorage.saveData("product3", "15.49 USD");
//        dataStorage.deleteData("product3");
//        assertNull(dataStorage.retrieveData("product3"));
//    }
//
//    @Test
//    void testUpdateData() {
//        dataStorage.saveData("product4", "8.79 USD");
//        dataStorage.saveData("product4", "7.99 USD");
//
//        assertEquals("7.99 USD", dataStorage.retrieveData("product4"));
//    }
//}
