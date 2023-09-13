package homework.hom11;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordOccurrenceCalculator {
    public static void calcOccurrence(List<String> wordList) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : wordList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> wordList = List.of("bird", "fox", "bird", "cat", "bird", "fox", "dog", "cat", "bird", "fox", "bird", "cat", "bird", "fox", "dog", "cat" , "cow", "puppy", "tiger", "panda");
        calcOccurrence(wordList);
    }
}