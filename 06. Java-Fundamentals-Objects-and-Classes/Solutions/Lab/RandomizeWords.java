package Lab;
import java.util.*;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int randomNumber = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[randomNumber];
            words[randomNumber] = temp;
        }
        printArray(words);
    }

    private static void printArray(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
