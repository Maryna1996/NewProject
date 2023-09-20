package homework.hom12;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class FileNavigator {
    private Map<String, List<FileData>> fileMap;

    public FileNavigator() {
        fileMap = new HashMap<>();
    }

    public void add(FileData file) {
        String filePath = file.getPath();
        String parentPath = getParentPath(filePath);

        // Check for consistency
        if (!fileMap.containsKey(parentPath)) {
            System.out.println("Error: path-key does not exist.");
            return;
        }

        List<FileData> fileList = fileMap.get(parentPath);
        fileList.add(file);
    }

    // Method to find files by given path
    public List<FileData> find(String path) {
        return fileMap.getOrDefault(path, new ArrayList<>());
    }

    // Method to filter files by size
    public List<FileData> filterBySize(long maxSize) {
        List<FileData> result = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            for (FileData file : fileList) {
                if (file.getSize() <= maxSize) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    // Method to remove the path and associated files
    public void remove(String path) {
        fileMap.remove(path);
    }
    // Method to sort files by size
    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> fileList : fileMap.values()) {
            allFiles.addAll(fileList);
        }

        Collections.sort(allFiles, Comparator.comparingLong(FileData::getSize));
        return allFiles;
    }

    // Internal method to get the parent path
    private String getParentPath(String path) {
        int lastSlashIndex = path.lastIndexOf('/');
        if (lastSlashIndex >= 0) {
            return path.substring(0, lastSlashIndex);
        }
        return "/";
    }
}