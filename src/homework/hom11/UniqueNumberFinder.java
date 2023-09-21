package homework.hom11;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumberFinder {
    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6, 7, 7, 8);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}