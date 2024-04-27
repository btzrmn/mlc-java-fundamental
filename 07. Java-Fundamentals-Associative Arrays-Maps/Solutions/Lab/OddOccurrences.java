package Lab;
import java.util.*;
public class OddOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }

        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);

        }

        List<String> oddKeys = new ArrayList<>();
        counts.entrySet().stream()
                .filter(e -> e.getValue() % 2 != 0)
                .forEach(e -> oddKeys.add(e.getKey()));

        System.out.println(String.join(", ", oddKeys));

    }
}
