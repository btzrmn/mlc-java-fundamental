package Lab;


import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");

        String text = scan.nextLine();

        for (String bannedWord : bannedWords) {
            int wordSize = bannedWord.length();

            while (text.contains(bannedWord)) {
                text = text.replaceAll(bannedWord, repeatString(wordSize));
            }

        }
        System.out.println(text);
    }

    private static String repeatString(int length) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append("*");

        }
        return result.toString();
    }
}
