package homework.App;
public class MainApp{
        public static void main(String[] args) {
            DataStorage dataStorage = DataStorageFactory.getDataStorage("file", "/Users/marynachubenko/IdeaProjects/NewProject/test_data.txt");
            dataStorage.saveData("key1", "value1");
                    String retrievedData = dataStorage.retrieveData("key1");
                    System.out.println("Retrieved data: " + retrievedData);
                    dataStorage.deleteData("key1");
                }
            }