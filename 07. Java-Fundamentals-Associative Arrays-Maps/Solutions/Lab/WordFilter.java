package Lab;
import java.util.*;
public class WordFilter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");

        Arrays.stream(words)
                .filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
