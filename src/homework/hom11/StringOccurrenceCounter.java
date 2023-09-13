package homework.hom11;

import java.util.List;

public class StringOccurrenceCounter {
    public static int countOccurrence(List<String> stringList, String target) {
        int count = 0;
        for (String str : stringList) {
            if (str.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "apple", "cherry", "apple", "date");
        String target = "apple";
        int occurrenceCount = countOccurrence(stringList, target);
        System.out.println("The number of occurrences of the string '" + target + "': " + occurrenceCount);
    }
}
