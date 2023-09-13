package homework.hom11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordOccurrenceFinder {
    public static List<Map<String, Object>> findOccurrence(List<String> wordList) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        List<Map<String, Object>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            Map<String, Object> wordOccurrence = new HashMap<>();
            wordOccurrence.put("name", entry.getKey());
            wordOccurrence.put("occurrence", entry.getValue());
            result.add(wordOccurrence);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> wordList = List.of("bird", "fox", "bird", "cat", "bird", "fox", "dog", "cat");
        List<Map<String, Object>> occurrenceList = findOccurrence(wordList);

        for (Map<String, Object> occurrence : occurrenceList) {
            System.out.println("name: " + occurrence.get("name") + ", occurrence: " + occurrence.get("occurrence"));
        }
    }
}
