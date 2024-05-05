package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.valueOf(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                if (containsDigit(matcher.group())) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : matcher.group().toCharArray()) {
                        if (Character.isDigit(c)) {
                            sb.append(c);
                        }
                    }
                    System.out.println("Product group: " + sb);
                } else {
                    System.out.println("Product group: 00");
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }

    static boolean containsDigit(String value) {
        boolean found = false;
        for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
