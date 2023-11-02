package homework.App;

public class MainApp {
    public static void main(String[] args) {
        // Create an instance of a class to work with memory
        DataStorage memoryDataStorage = new MemoryDataStorage();

        // Creating an instance of a class to work with files
        DataStorage fileDataStorage = new FileDataStorage();

        // Creating an instance of a class to work with the database
        String dbUrl = "jdbc:mysql://localhost:3306/hillel";
        String dbUser = "hillel";
        String dbPassword = "<hidden>";
        DataStorage databaseDataStorage = new DatabaseDataStorage(dbUrl, dbUser, dbPassword);

        // Usage example for MemoryDataStorage
        memoryDataStorage.save("key1", "data1");
        Object data = memoryDataStorage.get("key1");
        if (data != null) {
            System.out.println("Data from MemoryDataStorage: " + data);
        } else {
            System.out.println("No data found in MemoryDataStorage for key1.");
        }

        // Usage example for FileDataStorage
        fileDataStorage.save("key2", "data2");
        data = fileDataStorage.get("key2");
        if (data != null) {
            System.out.println("Data from FileDataStorage: " + data);
        } else {
            System.out.println("No data found in FileDataStorage for key2.");
        }

        // Usage example for DatabaseDataStorage
        databaseDataStorage.save("key3", "data3");
        data = databaseDataStorage.get("key3");
        if (data != null) {
            System.out.println("Data from DatabaseDataStorage: " + data);
        } else {
            System.out.println("No data found in DatabaseDataStorage for key3.");
        }
    }
}