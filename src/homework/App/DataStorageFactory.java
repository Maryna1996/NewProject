package homework.App;

class DataStorageFactory {
    public static DataStorage getDataStorage(String storageType, String filePath) {
        if (storageType.equalsIgnoreCase("memory")) {
            return new InMemoryDataStorage();
        } else if (storageType.equalsIgnoreCase("file")) {
            return new FileDataStorage(filePath);
        } else if (storageType.equalsIgnoreCase("database")) {
            return new DatabaseDataStorage();
        }
        return null;
    }
}

