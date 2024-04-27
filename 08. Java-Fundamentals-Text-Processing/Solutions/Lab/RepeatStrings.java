package Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String word: input) {
            int length = word.length();
            for (int i = 0; i < length; i++) {
                result.append(word);
            }
        }

        System.out.println(result);
    }
}
