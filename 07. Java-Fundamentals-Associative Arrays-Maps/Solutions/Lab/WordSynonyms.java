package Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }

        for (String word : words.keySet()) {
            System.out.printf("%s - ", word);
            System.out.println(String.join(", ", words.get(word)));
        }

    }
}
