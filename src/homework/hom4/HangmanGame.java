package homework.hom4;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        int index = random.nextInt(words.length);
        String targetWord = words[index];
        String hiddenWord = "###############";

        Scanner scanner = new Scanner(System.in);

        while (!hiddenWord.equals(targetWord)) {
            System.out.print("Guess a letter or the whole word: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(targetWord)) {
                System.out.println("Congratulations =) ! You've guessed the word: " + targetWord);
                break;
            }

            StringBuilder newHiddenWord = new StringBuilder(hiddenWord);
            for (int i = 0; i < targetWord.length(); i++) {
                if (targetWord.charAt(i) == guess.charAt(0)) {
                    newHiddenWord.setCharAt(i, guess.charAt(0));
                }
            }

            hiddenWord = newHiddenWord.toString();
            System.out.println(hiddenWord);
        }

        scanner.close();
    }
}
