package Lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (!line.equals("end")) {
            StringBuilder reversedString = new StringBuilder();

            for (int i = line.length() - 1; i >= 0 ; i--) {
                reversedString.append(line.charAt(i));

            }

            System.out.printf("%s = %s%n", line, reversedString);

            line = scan.nextLine();
        }
    }
}
