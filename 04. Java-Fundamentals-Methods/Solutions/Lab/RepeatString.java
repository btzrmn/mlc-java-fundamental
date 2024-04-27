package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        String repeatedString = repeatString(text, repetitions);
        System.out.println(repeatedString);

    }

    private static String repeatString(String text, int repetitions) {

        String result = "";
        for(int i = 0; i <repetitions ;i++){
            result +=text;
        }
        return result;
    }
}
