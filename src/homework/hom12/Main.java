package homework.hom12;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("file1.txt", 100, "/path/to/file");
        FileData file2 = new FileData("file2.txt", 200, "/path/to/file");
        FileData file3 = new FileData("file3.txt", 150, "/another/path");

        navigator.add(file1);
        navigator.add(file2);
        navigator.add(file3);

        // Search files by path
        List<FileData> filesAtPath = navigator.find("/path/to/file");
        for (FileData file : filesAtPath) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        // Filter files by size
        List<FileData> filteredFiles = navigator.filterBySize(200);
        for (FileData file : filteredFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }

        // Delete path and associated files
        navigator.remove("/path/to/file");

        // Sort files by size
        List<FileData> sortedFiles = navigator.sortBySize();
        for (FileData file : sortedFiles) {
            System.out.println("Name: " + file.getName() + ", Size: " + file.getSize() + " bytes");
        }
    }
}